package com.nitesh.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nitesh.springboot.entity.User;
import com.nitesh.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}	
	
	
	public String upsert(User user) {
		
		Integer userId = user.getUserId();
		
		userRepo.save(user);
		
		if(userId == null) {
			return "Record Inserted..";
		}else {
			return "Record updated..";
		}
	}

	
	public List<User> getAllUser() {		
		return userRepo.findAll();
	}

	
	public String deleteUser(Integer userId) {
		userRepo.deleteById(userId);
		
		return "Record deleted..";
	}
	
	

}
