package lesson7;

public class FinalExample{

    private final int finalVar;
    private int someInt;

    public FinalExample(){
        finalVar = 90;
        this.someInt = 90;
//        finalVar = 90; нельзя присвоить новое значени переменной final
    }

//    методы final
//    не могут быть переопределены в наследниках
    final void finalVoid(){
        System.out.println("finalVoid");
    }

//    агрументы методов final
    public void someVoid(final int a){
        if (a == 9){

        }

        this.someInt = a;
//        a = 9;
        final int localVar = 0;
    }

}


class FinalChild extends FinalExample {
//    методы final
//    не могут быть переопределены в наследниках
//    @Override
//    final void finalVoid(){
//        System.out.println("finalVoid");
//    }
}

final class FinalClass {
//    не может иметь наследников
}

