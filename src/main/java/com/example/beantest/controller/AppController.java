package com.example.beantest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beantest.util.Greet;

@RestController
public class AppController {
    @Autowired
    private Greet hello;

    @Autowired
    private Greet hi;

    @GetMapping("/hello")
    public void sayHello() {
        hello.say();
    }

    @GetMapping("/hi")
    public void sayHi() {
        hi.say();
    }

}
