package com.demo.spring_mvc_user_project_demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring_mvc_user_project_demo.pojo.UserPojo;

@Repository
public class UserDaoCollectionImpl implements UserDao {

	List<UserPojo> userDataStore;
	
	public UserDaoCollectionImpl() {
		userDataStore = new ArrayList<>();
		userDataStore.add(new UserPojo(101, "abc", "Chennai"));	
		userDataStore.add(new UserPojo(102, "xyz", "Mumbai"));
		userDataStore.add(new UserPojo(103, "lmn", "Pune"));
		userDataStore.add(new UserPojo(104, "qwe", "Vizag"));
	}
	
	@Override
	public List<UserPojo> fetchAllUsers() {
		return userDataStore;
	}

}
