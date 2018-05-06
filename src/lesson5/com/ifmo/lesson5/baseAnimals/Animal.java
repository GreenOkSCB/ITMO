package lesson5.com.ifmo.lesson5.baseAnimals; // пакет, в котором находится класс Animal

public class Animal {  // родительский класс для Pet и WildAnimal
    private String name; // правильно скрывать прямой доступ к полям
    private String color; // правильно скрывать прямой доступ к полям

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void privateVoid(){
        System.out.println("privateVoid");
    }

    public void say(){
        privateVoid();
        System.out.println("I am Animal");
    }
}
