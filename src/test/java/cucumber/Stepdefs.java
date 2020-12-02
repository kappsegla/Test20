package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Stepdefs {
    private String today;
    private String answer;
    private List<String> listOfDays;

    @Given("today is {string}")
    public void todayIs(String todayIs) {
        today = todayIs;
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        IsItFriday askAboutToday = new IsItFriday();
        answer = askAboutToday.isItFridayYet(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String todayExpected) {
        assertThat(answer).isEqualTo(todayExpected);
    }

    @Given("the following days:")
    public void theFollowingDays(List<String> days) {
        listOfDays = days;
    }

    @Then("tell me there is {int} Fridays")
    public void tellMeThereIsFridays(int count) {
        IsItFriday askAboutToday = new IsItFriday();
        assertThat(askAboutToday.countFridays(listOfDays)).isEqualTo(count);
    }
}
