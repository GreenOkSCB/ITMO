package lesson14_15.builder;

public class TopComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildDisplay() {
        computer.setDisplay("Top Display");
    }

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Top SBlok");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("keyboard+mouse+game-pad");
    }
}
