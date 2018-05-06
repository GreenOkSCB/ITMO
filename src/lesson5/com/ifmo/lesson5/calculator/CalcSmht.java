package lesson5.com.ifmo.lesson5.calculator;

public class CalcSmht {
    public static void main(String[] args) {
        Operation operation = new Plus(2, 3);
        System.out.println(operation.execute());

        operation = new Minus(2, 3);
        System.out.println(operation.execute());
    }
}
