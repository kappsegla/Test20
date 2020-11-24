package calculator;

public class Calculator {

    public int sum(int talA, int talB){
        return talA + talB;
    }

    public float divide(float a, float b){
        if( b == 0)
            throw new IllegalArgumentException("Divider can't be zero");
        return a / b;
    }
}

