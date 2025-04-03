package service;

import domain.Task;

import java.util.List;

public interface ITaskPrinter {
    void printTasks(List<Task> tasks);
}
