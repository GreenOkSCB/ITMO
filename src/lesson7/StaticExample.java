package lesson7;

public class StaticExample {
    public static void main(String[] args){
//        доступ  к статическим переменным: имя_класса.имя_переменной
        System.out.println(StaticClass.staticVar);
        StaticClass staticClass1 = new StaticClass();
        StaticClass staticClass2 = new StaticClass();
        StaticClass staticClass3 = new StaticClass();

        System.out.println(staticClass1.getNotStaticVar());
        System.out.println(staticClass1.getStaticVar());

        System.out.println(staticClass2.getNotStaticVar());
        System.out.println(staticClass2.getStaticVar());

        System.out.println(staticClass3.getNotStaticVar());
        System.out.println(staticClass3.getStaticVar());

//        доступ  к статическим методам: имя_класса.имя_метода
        StaticClass.StaticVoid();
//        обращение к статическому методу интерфейса
        StaticInterface.staticVoid1();
//        StaticExample.staticVoid1();
    }
}

class StaticClass extends StaticParent implements StaticInterface{
//    статическими могут быть
//    переменные
//    методы
//    вложенные классы

    // создание статической переменной
    static int staticVar = 0;
    int notStaticVar = 0;

    public StaticClass(){
        staticVar++;
        notStaticVar++;
    }

    public int getStaticVar(){
        return staticVar;
    }
    //
    public int getNotStaticVar(){
        return notStaticVar;
    }

    //    статические методы
    static void StaticVoid(){
        System.out.println(staticVar);
//        System.out.println(this.notStaticVar); - ошибка

//        могут вызывать только другие статические методы
//        могут работать со статическими переменными
//        в них нельзя обращаться к this и super
    }
    //    статические методы интерфейса нельзя переопределить
//    @Override
//    только создать новый
//    static void staticVoid1(){
//        System.out.println("staticVoid StaticExample");
//    }
    //@Override
    static void staticParentVoid(){
        System.out.println("staticVoid StaticParent");
    }
}

//JAVA 8!

interface StaticInterface {
    //    статические методы интерфейса нельзя переопределить
//    доступны внутри интерфейса
//    могут использоваться через интерфейс: имя_интерфейса.имя_метода
    static void staticVoid1(){
        System.out.println("staticVoid Interface");
    }
}

class StaticParent{
    static void staticParentVoid(){
        System.out.println("staticVoid StaticParent");
    }
}
