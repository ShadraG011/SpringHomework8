package ru.shadrag.hw8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shadrag.hw8.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
}
