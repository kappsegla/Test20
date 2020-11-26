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
