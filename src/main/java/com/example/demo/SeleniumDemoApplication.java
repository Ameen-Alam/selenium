package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleniumDemoApplication.class, args);
		new LoginSelenium();
	}

}
