package lesson5.com.ifmo.lesson5;

import lesson5.com.ifmo.lesson5.animals.Cat;
import lesson5.com.ifmo.lesson5.animals.Dog;
import lesson5.com.ifmo.lesson5.baseAnimals.Animal;
import lesson5.com.ifmo.lesson5.baseAnimals.Pet;

public class CreateAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat("Kitty");  // можно создавать объекты через родительские классы
        animal.setColor("black");
        System.out.println(animal.getName());

        Pet pet = new Dog("Puppy", "gray");
        pet.liveWithPeople();
        pet.say();

        Cat cat = new Cat("Мурка");
        cat.say();
        cat.say("Mew - mew");
        cat.setColor("3d color");
        System.out.println(cat.getName());
        System.out.println(cat.getColor());

    }
}
