package lesson14_15.builder;

public class CheapComputerBuilder extends
        AbstractComputerBuilder {
    @Override
    public void buildDisplay() {
        computer.setDisplay("TFT");
    }

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("No name");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}
