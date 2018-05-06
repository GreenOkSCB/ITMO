package lesson6.figures;

public class MakeFigure {
    public static void main(String[] args) {
        Figure figure = new Circle(10);
        System.out.println(figure.getInfo() + " " + figure.getName() + " площадью " + figure.getArea());

        figure = new Rectangle(10,10);
        System.out.println(figure.getInfo() + " " + figure.getName() + " площадью " + figure.getArea());
    }
}
