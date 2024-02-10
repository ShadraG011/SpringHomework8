package ru.shadrag.hw8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shadrag.hw8.annotation.UserActivityChecked;
import ru.shadrag.hw8.models.User;
import ru.shadrag.hw8.repositories.UsersRepository;
import ru.shadrag.hw8.services.interfaces.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @UserActivityChecked
    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @UserActivityChecked
    @Override
    public User getUserById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    @UserActivityChecked
    @Override
    public User createUser(User user) {
        return usersRepository.save(user);
    }

    @UserActivityChecked
    @Override
    public void deleteUser(Long id) {
        User deletedUser = getUserById(id);
        usersRepository.delete(deletedUser);
    }
}
