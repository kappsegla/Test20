package stack;

import java.time.LocalTime;

public class LifoStack {

    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public int pop() {
        if( isEmpty())
            throw new IllegalStateException();
        return 0;
    }

    public void push(int i) {
        empty = false;
    }
}


    assertThrows()
    assertThatThrownBy(()-> calculator.mul(1,)
        .isInstanceOf(IllegalStateException.class)
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy()
        assertThatIllegalStateException().isThrownBy()

//
//        Test on zero elements.
//
//        Test that it's empty.
//        Count is zero.
//        Pop fails.
//        Test on one element:
//
//        Call Push.
//        Test that it's not empty.
//        Test that count is 1.
//        Test that Pop returns the element.
//        Test that it's now empty.
//        Test that count is now 0.
//        Test on >1 elements:
//
//        Now Push 2 and test count is two.
//        Pop 2 and make sure they come in LIFO order.
//        Check the emptiness and counts.