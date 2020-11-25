package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LifoStackTest {

    @Test
    void createInstanceOfStack(){
        LifoStack stack = new LifoStack();
    }

    @Test
    void newStackIsEmpty(){
        LifoStack stack = new LifoStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void popFromEmptyStackThrowsException(){
        LifoStack stack = new LifoStack();
        assertThrows(IllegalStateException.class,() -> stack.pop());
    }

    @Test
    void pushOneItemToStackIsEmptyReturnsFalse(){
        LifoStack stack = new LifoStack();
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test
    void pushOneItemToStackPopReturnsThatItem(){
        LifoStack stack = new LifoStack();
        stack.push(0);
        assertEquals(0, stack.pop());
    }









}
