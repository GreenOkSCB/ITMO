package lesson5.com.ifmo.lesson5.calculator;

public class Minus extends Operation{

    public Minus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int execute() {
        return getA() - getB();
    }
}
