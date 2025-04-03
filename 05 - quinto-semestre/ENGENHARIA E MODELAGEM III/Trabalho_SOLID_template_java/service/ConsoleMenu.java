package service;

import domain.TaskManager;

import java.util.Scanner;

public class ConsoleMenu {

    private final TarefasService tarefasService;
    private final ITaskPrinter taskPrinter;

    public ConsoleMenu( TaskManager taskManager,ITaskPrinter taskPrinter) {
        //Injetando dependências via construtor
        this.tarefasService = new TarefasService(taskManager);
        this.taskPrinter = taskPrinter;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {  // Try-with-resources para fechar o Scanner
            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Criar nova tarefa");
                System.out.println("2. Listar tarefas");
                System.out.println("3. Marcar tarefa como concluída");
                System.out.println("4. Filtrar por prioridade");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // consumir \n

                switch (opcao) {
                    case 1:
                        tarefasService.criarTarefas(scanner);
                        break;
                    case 2:
                        tarefasService.listarTarefas(taskPrinter);
                        break;
                    case 3:
                        tarefasService.marcarTarefas(scanner,taskPrinter);
                        break;
                    case 4:
                        tarefasService.filtrarTarefas(scanner,taskPrinter);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
    }


}
