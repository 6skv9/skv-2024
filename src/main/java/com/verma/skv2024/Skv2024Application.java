package com.verma.skv2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Skv2024Application {

	public static void main(String[] args) throws Exception {
		System.out.println("Spring Boot Application");
		throw new Exception("");
		SpringApplication.run(Skv2024Application.class, args);
	}

}
