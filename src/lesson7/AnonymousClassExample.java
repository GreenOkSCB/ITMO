package lesson7;

public class AnonymousClassExample {
    public void createClass(){
        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();

        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void firstVoid() {

            }
            @Override
            public void secondVoid() {

            }
            @Override
            public void thirdVoid() {

            }
        };
        someInterface.secondVoid();
    }


    SomeAbstract someAbstract = new SomeAbstract(){

        @Override
        void first() {

        }

        @Override
        void second() {

        }

        @Override
        void third() {

        }
    };
}

abstract class SomeAbstract{
    abstract void first();
    abstract void second();
    abstract void third();
}

interface SomeInterface{
    public void firstVoid();
    public void secondVoid();
    public void thirdVoid();
}
