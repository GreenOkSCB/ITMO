package lesson5.com.ifmo.lesson5.baseAnimals;

// наследование extends
public class Pet extends Animal { // Дочерний класс для Animal и родительский класс для Cat и Dog

    public Pet(String name) {
        super(name); // вызов родительского конструктора
    }

    public Pet(String name, String color) {
        super(name, color); // вызов родительского конструктора
    }

    public void liveWithPeople(){
        System.out.println("I am live with people");
    }

    @Override // сообщаем компилятору о переопределении родительского метода say
    public void say() {
        super.say(); // вызов родительского конструктора
        System.out.println("I am Pet"); // расширяем родительский метод
    }
}
