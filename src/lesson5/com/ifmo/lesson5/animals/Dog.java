package lesson5.com.ifmo.lesson5.animals;

import lesson5.com.ifmo.lesson5.baseAnimals.Pet;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override // сообщаем компилятору о переопределении родительского метода say
    public void say() {
        // вызов родительского метода не осуществляем
        System.out.println("I am cat"); // полностью изменяем функционал родительского метода say
    }
}
