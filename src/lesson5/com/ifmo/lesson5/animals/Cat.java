package lesson5.com.ifmo.lesson5.animals;

import lesson5.com.ifmo.lesson5.baseAnimals.Pet; // импорт класса Pet для использования

public class Cat extends Pet{ // Дочерний класс для Pet

    public Cat(String name) {
        super(name);
    }

    @Override // сообщаем компилятору о переопределении родительского метода say
    public void say() {
        super.say(); // вызов родительского метода
        System.out.println("I am cat"); // расширяем родительский метод
    }

    // перегрузили метод say - одинаковое название, но разные параметры
    public void say(String catWords){
        System.out.println(this.getName() + " say " + catWords); // расширяем родительский метод
    }
}
