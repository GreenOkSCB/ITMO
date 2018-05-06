package lesson14_15.command;

public class Command1Command extends Command{
    @Override
    boolean execute() {
        // реализация выполнения конкретной команды
        System.out.println("Command 1");
        return true;
    }
}
