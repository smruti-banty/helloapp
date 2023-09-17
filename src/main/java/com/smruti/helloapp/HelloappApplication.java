package com.smruti.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

	@GetMapping("/")
	String hello() {
		return  "Hello Spring";
	}
}
