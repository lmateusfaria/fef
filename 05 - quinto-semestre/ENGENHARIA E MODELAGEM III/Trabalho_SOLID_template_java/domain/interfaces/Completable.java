package domain.interfaces;
/**
 * Interface responsável por fornecer a capacidade
 * de marcar uma tarefa como concluída.
 */
public interface Completable {
    void markAsDone();
    boolean isDone();
}
