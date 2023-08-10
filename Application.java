package com.poornesh.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.poornesh.controller"})
@ComponentScan(basePackages= {"com.poornesh.been"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
