package lesson4;

// объявили класс с именем Human
public class Human { // если класс имеет модификатор public, то имя файла должно соответствовать имени класса
    // в файле может быть только один класс с модификатором public

    // объявляем поля (свойства) класса
    String name;
    int age;
    String sex;
    boolean walking;

    Animal animal;

// конструктор - вызывается при создании нового объекта, инициализирует объект непосредственно во время создания.
// Имя конструктора совпадает с именем класса, включая регистр

// Если в классе не описан конструктор, компилятор автоматически добавляет в код конструктор без параметров

    public Human(String name, int age) {
        this.name = name;  // можно установить значения свойств для объекта в момент создания этого объекта
        this.age = age;
        walking = false;
    }
    //  Класс может иметь несколько конструкторов (они должны иметь разные параметры)
    public Human(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
        walking = false;
    }

    // this - ссылка ОБЪЕКТА на себя, на текущий ОБЪЕКТ
    // используется для обращения к свойствам и методам класса внутри этого класса (не static)

    // объявление методов:
    //    void означает, что метод не имеет возвращаемого значения.
    public void walk() {
        if (!walking) {
            System.out.println("Walking...");
            walking = true;
        } else {
            System.out.println("Already Walking...");
        }
    }


    public void stop(){
        if (walking) {
            System.out.println("Stop...");
            walking = false;
        } else {
            System.out.println("Already Stop...");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //    Если метод возвратил какое-то значение, то вместо void указывается тип этого значения

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWalking() {
        return walking;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getSex() {
        return sex;
    }


}
