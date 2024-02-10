package ru.shadrag.hw8.services.interfaces;

import ru.shadrag.hw8.models.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}
