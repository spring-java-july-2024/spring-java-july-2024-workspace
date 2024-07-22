package com.demo.spring_mvc_hellomvc_project_demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	// here we will create request handler methods	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("hello");
		return "hello-view"; //  here hello-view is the name of the web page that we want to return back to the client
	}
	
}
