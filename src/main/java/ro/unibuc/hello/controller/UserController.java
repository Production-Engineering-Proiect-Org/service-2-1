package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.UserService;
import ro.unibuc.hello.data.UserEntity;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserEntity> artist() throws EntityNotFoundException {
        return userService.getAllUsers();
    }
}