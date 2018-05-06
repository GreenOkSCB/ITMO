package lesson5.com.ifmo.lesson5.calculator;

public class Operation {

    private int a, b;

    public Operation(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }

    protected int execute(){
        return 0;
    }
}
