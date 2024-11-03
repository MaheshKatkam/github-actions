package com.docker.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(
		"docker-demo"
)
public class DockerSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloMessage(@RequestParam("name") String name) {
		return "Hello " + name + " Welcome to docker demo";
	}

}
