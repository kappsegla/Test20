package simple;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class SomeClassTest {

    public static final int NUMBER = 77;
    public static final int NUMBER_DOUBLED = 154;

    SomeClass someClass = new SomeClass();

    @Test
    void Double_A_Number_Returns_Number_Doubled() {
        assertEquals(NUMBER_DOUBLED, someClass.doubleANumber(NUMBER));
    }

    @Test
    void Input_Save_Returns_True() {
        assertTrue(someClass.returnABoolean("Save"));
    }

    @Test
    void Input_Load_Returns_False() {
        assertFalse(someClass.returnABoolean("Load"));
    }

    @Test
    void Input_Save_Ignores_Case_Returns_True() {
        assertTrue(someClass.returnABoolean("SAVE"));
    }

    @Test
    void Input_NULL_Returns_False() {
        assertFalse(someClass.returnABoolean(null));
    }

    @Test
    void Foo_Throws_Exception_When_Not_Ok() {
        assertThrows(IllegalArgumentException.class,
                () -> someClass.voidFoo("Not_Ok"));
    }

    @Test
    void Foo_Prints_Text_When_Ok(){
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;

        System.setOut(stream);

        someClass.voidFoo("Ok");
        assertEquals("doing something." + System.lineSeparator() , outputStream.toString());

        System.setOut(originalOut);
    }
}
