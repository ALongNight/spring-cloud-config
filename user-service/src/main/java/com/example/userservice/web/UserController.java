package com.example.userservice.web;

import com.example.userservice.domain.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PlatformTransactionManager transactionManager;


    @GetMapping("/{id}")
    public User findById(@PathVariable("id")Long id){
        return userService.findById(id);
    }

    @PostMapping
    public int createUser(@RequestBody User user) throws Exception {
        return userService.createUser(user);
    }

    @GetMapping("/transaction")
    public String getTransactionManager(){
        return transactionManager.toString();
    }
}
