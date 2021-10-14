package com.javamaster.springjpapostgres.Controllers;

import com.javamaster.springjpapostgres.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.javamaster.springjpapostgres.Repos.UsersRepository;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UsersRepository userRepository;

    @Autowired
    public UserController(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }
    /*
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
     */

    @GetMapping("/users")
    public @ResponseBody
    ResponseEntity<List<User>> getAddress() throws IOException {
        var users = this.userRepository.findAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
