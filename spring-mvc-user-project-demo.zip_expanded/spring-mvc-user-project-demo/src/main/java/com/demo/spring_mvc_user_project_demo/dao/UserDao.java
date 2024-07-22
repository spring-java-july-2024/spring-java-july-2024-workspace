package com.demo.spring_mvc_user_project_demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring_mvc_user_project_demo.pojo.UserPojo;


public interface UserDao {
	public List<UserPojo> fetchAllUsers();
}
