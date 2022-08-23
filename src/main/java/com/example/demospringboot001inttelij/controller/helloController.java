package com.example.demospringboot001inttelij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping
    public String helloClass() {
        System.out.println("hello from inside the console");
        return "test";

    }
}
