package com.nitesh.springboot.service;

import java.util.List;

import com.nitesh.springboot.entity.User;

public interface UserService {
	
	public String upsert(User user);
	
	public List<User> getAllUser();
	
	public String deleteUser(Integer userId);

}
