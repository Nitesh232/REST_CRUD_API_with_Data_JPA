package com.nitesh.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nitesh.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable> {
	

}
