package lesson14_15.builder;

public class BuilderUse {
    public static void main(String[] args) {
        Director director = new Director();
        AbstractComputerBuilder cheapComputerBuilder =
                new CheapComputerBuilder();

        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();

        Computer computer = director.getComputer();
        System.out.println(computer);

    }
}
