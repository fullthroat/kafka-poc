package com.lollibond.company.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lollibond.company")
public class Application {

	public static void main(String[] args) {
		System.out.println("Starting..............................");
		SpringApplication.run(Application.class, args);
		System.out.println(">>>>>>>>>>>> Started");
	}
}
