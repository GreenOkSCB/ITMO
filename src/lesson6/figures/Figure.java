package lesson6.figures;

public interface Figure {

    double getArea();
    String getName();

    default String getInfo(){
        return "Фигура";
    }

}
