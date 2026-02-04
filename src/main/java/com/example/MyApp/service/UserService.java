package com.example.MyApp.service;

import com.example.MyApp.entity.User;
import com.example.MyApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //inject the repository you will use
    @Autowired
    private UserRepository repo;

    //provide db operations methods

    //find all
    public List<User> list() {
        return repo.findAll();
    }

    //get by id
    public User get(Long id) {
        return repo.findById(id).orElseThrow();
    }

    //create
    public User create(User u) {
        return repo.save(u);
    }

    //delete
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
