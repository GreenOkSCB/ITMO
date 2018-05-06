package lesson6.figures;

public class Circle implements Figure {

    private double radius;
    private String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


