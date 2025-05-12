package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Git Demo!";
    }

    @GetMapping("/demo")
    public String demo() {
        return "Hello, Git Demo!";
    }

    @GetMapping("/demo2")
    public String Demo2() {
        return "Hello, Git Demo2!";
    }

    @GetMapping("/helloUser")
    public String helloUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("John Doe");
        user.setEmail(" user = new User();
        user.setId(1L);
        user.setUsername("John Doe");
        user.setEmail("EMAIL");
        user.setPassword("password");
        user.setRole(1L);

        return "Hello, " + user.getUsername() + " !";
    }
        
}