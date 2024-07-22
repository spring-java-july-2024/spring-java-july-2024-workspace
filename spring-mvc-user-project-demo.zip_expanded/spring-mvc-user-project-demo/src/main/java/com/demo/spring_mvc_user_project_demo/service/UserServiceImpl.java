package com.demo.spring_mvc_user_project_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_mvc_user_project_demo.dao.UserDao;
import com.demo.spring_mvc_user_project_demo.pojo.UserPojo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public List<UserPojo> fetchAllUsers() {
		return userDaoImpl.fetchAllUsers();
	}

}
