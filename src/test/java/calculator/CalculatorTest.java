package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    @DisplayName("Two numbers should be summed")
    void Should_Return_Sum_Of_Two_Numbers(){
        //Arrange
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        //Act
        var result = calculator.sum(a,b);

        //Assert
        assertEquals(2,result,"sum of 1 and 1 should be 2.");
    }






}
