package io.frcalan.workshopmongo.service;

import io.frcalan.workshopmongo.domain.User;
import io.frcalan.workshopmongo.repository.UserRepository;
import io.frcalan.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }
}
