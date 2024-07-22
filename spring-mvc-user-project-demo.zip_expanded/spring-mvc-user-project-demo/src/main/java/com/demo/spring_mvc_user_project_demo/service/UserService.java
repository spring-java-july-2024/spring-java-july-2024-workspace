package com.demo.spring_mvc_user_project_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.spring_mvc_user_project_demo.pojo.UserPojo;


public interface UserService {
	public List<UserPojo> fetchAllUsers();
}
