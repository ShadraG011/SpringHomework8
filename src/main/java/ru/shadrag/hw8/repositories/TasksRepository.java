package ru.shadrag.hw8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shadrag.hw8.models.Task;

public interface TasksRepository extends JpaRepository<Task, Long> {
}
