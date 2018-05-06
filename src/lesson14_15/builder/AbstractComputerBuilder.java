package lesson14_15.builder;

abstract public class AbstractComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createComputer(){
        computer = new Computer();
    }

    public abstract void buildDisplay();
    public abstract void buildSystemBlock();
    public abstract void buildManipulators();
}

