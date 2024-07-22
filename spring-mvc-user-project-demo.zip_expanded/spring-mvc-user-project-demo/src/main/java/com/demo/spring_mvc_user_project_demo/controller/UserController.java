package com.demo.spring_mvc_user_project_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.spring_mvc_user_project_demo.pojo.UserPojo;
import com.demo.spring_mvc_user_project_demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@GetMapping("/users")
	public String getAllUsers(Model model) {
		List<UserPojo> allUsers = userServiceImpl.fetchAllUsers();
		model.addAttribute("all_users", allUsers);
		return "display-users";
	}
}
