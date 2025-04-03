package domain;

import domain.interfaces.Completable;

import java.awt.print.Printable;

public class Task implements Completable {
    private String title;
    private String priority;
    private boolean done;

    public Task(String title, String priority) {
        this.title = title;
        this.priority = priority;
        this.done = false;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public void markAsDone() {
        this.done = true;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    /**
     * Retorna uma representação textual da tarefa.
     * Essa abordagem permite que a lógica de impressão seja delegada a uma classe de apresentação.
     */
    @Override
    public String toString() {
        return "[" + (done ? "X" : " ") + "] " + title + " (Prioridade: " + priority + ")";
    }
}
