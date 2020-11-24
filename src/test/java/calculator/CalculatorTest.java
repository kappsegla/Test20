package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Two numbers should be summed")
    void Should_Return_Sum_Of_Two_Numbers(){
        //Arrange
        int a = 1;
        int b = 1;

        //Act
        var result = calculator.sum(a,b);

        //Assert
        assertEquals(2,result,"sum of 1 and 1 should be 2.");
    }


    @Test
    void Trying_To_Divide_By_Zero_Should_Throw_Exception()
    {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
    }






}
