package ru.shadrag.hw8.services.interfaces;

import ru.shadrag.hw8.models.Task;
import ru.shadrag.hw8.models.User;

import java.util.List;

public interface TasksService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task updateTask(Long id, Task task, User user);
    void deleteTask(Long id);
}
