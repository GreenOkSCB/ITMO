package lesson4;

public class CreateHuman {
    public static void main(String[] args) {
        Human man = new Human("Иван", 20); // создали объект класса Human
        man.setSex("мужчина"); // значение полей лучше устанавливать через методы, а не обращаться к ним напрямую

        Animal cat = new Animal("Пуговка", "gray"); // создали объект класса Animal
        man.setAnimal(cat); // вызвали метод объекта
        System.out.println(man.getSex() + " по имени " + man.getName() + " завел " + man.getAnimal());

        Human women = new Human("Маша", 19, cat); // создали другой объект класса Human, используя другой конструктор
        women.setSex("женщина"); // установили свойство для объекта women

        System.out.println(women.getSex() + " по имени " + women.getName() + " завел " + women.getAnimal());

//        man и women - разные объекты одного классы, у них одинаковый набор свойств, но их значения могут быть разные,
//        так же они имеют однинаковые методы

//        cat - объект класса Cat
    }
}
