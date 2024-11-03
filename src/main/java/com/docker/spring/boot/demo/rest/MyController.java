package com.docker.spring.boot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {

    @GetMapping("/hello")
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
