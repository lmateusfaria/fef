package service;

import domain.Task;
import domain.TaskManager;

import java.util.Scanner;

public class TarefasService {

    private final TaskManager manager;

    public TarefasService(TaskManager manager) {
        this.manager = manager;
    }

    public void criarTarefas(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Prioridade (Alta, Média, Baixa): ");
        String prioridade = scanner.nextLine();
        manager.addTask(new Task(titulo, prioridade));

    }

    public void listarTarefas(ITaskPrinter printer) {
        printer.printTasks(manager.getAllTasks());
    }

    public void marcarTarefas(Scanner scanner, ITaskPrinter printer) {
        printer.printTasks(manager.getAllTasks());
        System.out.print("Número da tarefa para marcar como concluída: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < manager.getAllTasks().size()) {
            manager.getAllTasks().get(index).markAsDone();
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void filtrarTarefas(Scanner scanner, ITaskPrinter printer) {
        System.out.print("Prioridade para filtrar: ");
        String filtro = scanner.nextLine();
        printer.printTasks(manager.filterByPriority(filtro));

    }



}
