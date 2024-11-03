package com.docker.spring.boot.demo;

import com.docker.spring.boot.demo.rest.MyController;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	public static Logger logger = LoggerFactory.getLogger(DockerSpringBootDemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application is started");
	}

	public static void main(String[] args) {
		logger.info("Application is executed");
		SpringApplication.run(DockerSpringBootDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloMessage(@RequestParam("name") String name) {
		return "Hello " + name + " Welcome to docker demo";
	}

}
