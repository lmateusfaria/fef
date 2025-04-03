import domain.TaskManager;
import service.ConsoleMenu;
import service.ConsoleTaskPrinter;
import service.ITaskPrinter;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        ITaskPrinter printer = new ConsoleTaskPrinter();
        ConsoleMenu menu = new ConsoleMenu(manager, printer);
        menu.start();
    }
}
