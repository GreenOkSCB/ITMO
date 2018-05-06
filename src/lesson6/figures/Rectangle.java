package lesson6.figures;

public class Rectangle implements Figure {

    private String name = "Rectangle";
    private double width;
    private double height;

    public Rectangle(double width, double height) { // alt + insert в idea -> constructor
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getInfo() {
        return "Большая фигура";
    }
}
