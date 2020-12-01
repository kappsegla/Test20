package report;

import mtk.domain.Employee;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

//https://codingdojo.org/kata/Employee-Report/

public class EmployeeReportTest {

    List<Employee> employees = List.of(
            new Employee("21","Max", 17 ),
            new Employee("3","Sepp", 18 ),
            new Employee("10","Nina", 15 ),
            new Employee("2","Mike", 51 ));

    @Test
    public void firstTestMethod(){
        //assertThat()
    }
}
