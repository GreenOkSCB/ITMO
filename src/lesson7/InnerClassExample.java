package lesson7;

public class InnerClassExample {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
        innerStatic.notStatic();

        Object obj = outerClass.voidWithClass();
//        obj.localVoid();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    }
}

class OuterClass {
//    static
    private int notStaticInt = 1;
    private static int staticInt = 2;

    public OuterClass(){
        InnerStatic.someVoid();
        InnerStatic innerStatic = new InnerStatic();
        System.out.println(innerStatic.innerInt);

        InnerClass innerClass = new InnerClass();
        innerClass.innerVoid();
    }
//   static
    static class InnerStatic{
        private int innerInt = 1;

        public static void someVoid(){
//            имеет доступ только
// к статическим методам и свойствам внешнего класса
            staticInt++;
//            notStaticInt;
        }
        public void notStatic(){

        }
    }


//  member inner class
    class InnerClass{
//        ему доступны все методы и свойства внешнего класса
        public void innerVoid(){
            System.out.println(notStaticInt);
            System.out.println(staticInt);
        }

        // не может содержать статических методов и свойств
//        public static void staticVoid(){  ошибка
//
//        }
    }

    public Object voidWithClass(){

        class LocalClass {
            public void localVoid(){
                System.out.println(staticInt);
                System.out.println(notStaticInt);
            }
        }
        return new LocalClass();
    }
}



class ChildOuter extends OuterClass{

    public void someChildVoid(){
        InnerStatic.someVoid();
    }

}













