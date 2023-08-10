package com.poornesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

		// TODO Auto-generated method stub
		@GetMapping("/")
		public String message() {
			return "welcome to spring boot appication ";
			
		}
		@GetMapping("/hello-world")
		public String helloWorld() 
		{
			return "Hello World ";
			
		}
}
	


