package com.demo.spring_rest_hello_project_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	// here we create the rest handler methods for the endpoints that we expose
	@GetMapping("/hello-rest")
	public String getHello() {
		return "Hello Rest API!!";
	}
}
