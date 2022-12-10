package com.upgrad.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		System.out.println("application running...");
	}


	@RequestMapping("/")
	public String helloPeople(){
		return "Hello, People! Welcome to Spring boot world. Spring boot is nothing but Spring on steroids";
	}

}
