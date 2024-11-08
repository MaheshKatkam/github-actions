package com.docker.spring.boot.demo.rest.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MyController {

    public static Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/hello")
    public String sayHello(String name) {
        logger.info("Starting sayHello API ");
        return "Hello From V2 Service" + name;
    }
}
