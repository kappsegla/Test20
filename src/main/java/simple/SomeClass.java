package simple;

public class SomeClass {

    public int doubleANumber(int num) {
        return num * 2;
    }

    public boolean returnABoolean(String inputData) {
        return "Save".equalsIgnoreCase(inputData);
    }

    public void voidFoo(String inputData) {
        if ("Ok".equalsIgnoreCase(inputData)) {
            System.out.println("doing something.");
        } else {
            throw new IllegalArgumentException("Bad argument:" + inputData);
        }
    }
}