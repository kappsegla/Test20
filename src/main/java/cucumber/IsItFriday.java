package cucumber;

import java.util.List;

public class IsItFriday {
    public String isItFridayYet(String today) {
        if( "Friday".equals(today))
            return "TGIF";
        return "Nope";
    }

    public int countFridays(List<String> days) {
        return (int) days.stream().filter(s -> s.equals("Friday")).count();
    }
}
