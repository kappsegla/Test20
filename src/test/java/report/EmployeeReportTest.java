package report;

import mtk.domain.Company;
import mtk.domain.Employee;
import org.apache.http.util.Asserts;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//https://codingdojo.org/kata/Employee-Report/

public class EmployeeReportTest {

    List<Employee> employees = List.of(
            new Employee("21", "Max", 0,17),
            new Employee("3", "Sepp", 0,18),
            new Employee("10", "Nina",0, 15),
            new Employee("2", "Mike", 0,51));

    @Test
    public void AllEmployessOver18() {
        Company company = new Company("Handlarn");
        company.addEmployees(employees);

        var over17 = company.getEmployessOver18();

        assertThat(over17).containsExactlyInAnyOrder(
                new Employee("3", "Sepp", 0,18), new Employee("2", "Mike",0, 51));
    }


    @Test
    public void firstTestMethod() {
        Company company = new Company("Martin AB");
        company.addEmployee(new Employee("1", "martin", 100000));

        var employee = company.findEmployeeById("1");

//        assertEquals("1", employee.getId());
//        assertEquals("Martin", employee.getName());
        assertTrue(employee.getSalary() > 90000 && employee.getSalary() < 120000);

        //AssertJ
        assertThat(employee.getName()).isEqualTo("Martin");
        assertThat(employee.getName()).as("Employee name isn't right").isEqualTo("Martin").startsWith("M").contains("a");
        assertThat(employee.getSalary()).isGreaterThan(90000).isLessThan(120000).isNotEqualTo(99999);
        assertThat(employee).extracting("id", "name").contains("1", "Martin");


        //Junit
        assertEquals("Martin", employee.getName());
        //AssertJ
        assertThat(employee.getName()).isEqualTo("Martin");
        //Hamcrest
        org.hamcrest.MatcherAssert.assertThat(employee.getName(), equalTo("Martin"));
    }
}
