package com.example.MyApp.controller;

import com.example.MyApp.entity.User;
import com.example.MyApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    // create / post
    @PostMapping
    public User addUser(@RequestBody User u) {
        return userRepo.save(u);
    }

    // read
    // get all
    @GetMapping
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    //get by id
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepo.findById(id).orElse(null);
    }

    // update / put
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newData) {
        return userRepo.findById(id).map(user -> {
            user.setName(newData.getName());
            user.setSurname(newData.getSurname());
            return userRepo.save(user);
        }).orElse(null);
    }

    // delete
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepo.deleteById(id);
    }

}
