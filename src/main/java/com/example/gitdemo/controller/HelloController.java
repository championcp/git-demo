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
}