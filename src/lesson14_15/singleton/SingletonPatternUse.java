package lesson14_15.singleton;

public class SingletonPatternUse {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstanсe();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstanсe();
        singletonPattern.setName("singletonPattern2");
        SingletonPattern singletonPattern3 = SingletonPattern.getInstanсe();
        System.out.println(singletonPattern3.getName());
    }
}

class SingletonPattern {
    String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    // приватный конструктор
    private SingletonPattern(){
        System.out.println("patterns.SingletonPattern");
    }

    // Объект создается в классе!!!
    private static final SingletonPattern INSTANСE = new SingletonPattern();

    public static SingletonPattern getInstanсe(){
        return INSTANСE;
    }
}

class SingletonPattern2 {
    private static SingletonPattern2 instance;

    // приватный конструктор
    private SingletonPattern2(){
        System.out.println("patterns.SingletonPattern2");
    }

    public static SingletonPattern2 getInstance(){
        if (instance == null) {
            instance = new SingletonPattern2();
        }
        return instance;
    }
}
