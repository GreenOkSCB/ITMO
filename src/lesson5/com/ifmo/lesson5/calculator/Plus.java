package lesson5.com.ifmo.lesson5.calculator;

public class Plus extends Operation {

    public Plus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int execute() {
        return getA() + getB();
    }
}
