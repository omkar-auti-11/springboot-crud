package com.todo.crud.service;
import com.todo.crud.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User createUser(User user) {
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public User getUser(Long id) {
        return users.get(id);
    }

    public User updateUser(Long id, User updatedUser) {
        updatedUser.setId(id);
        users.put(id, updatedUser);
        return updatedUser;
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }
}