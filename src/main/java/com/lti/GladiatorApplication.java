package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti")
public class GladiatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GladiatorApplication.class, args);
	}
}