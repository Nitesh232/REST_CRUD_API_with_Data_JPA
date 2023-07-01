package com.nitesh.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nitesh.springboot.entity.User;
import com.nitesh.springboot.service.UserService;

@RestController
public class UserRestController {
	
	
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		
		String msg = service.upsert(user);
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = service.getAllUser();
		
		return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
	}
	
	@PutMapping("/user")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		
		String msg = service.upsert(user);
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
		
		String msg = service.deleteUser(userId);
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
