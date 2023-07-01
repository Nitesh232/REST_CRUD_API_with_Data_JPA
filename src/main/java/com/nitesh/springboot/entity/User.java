package com.nitesh.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User_Details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "USER_FirstName")
	private String userFirstName;
	
	@Column(name = "USER_LastName")
	private String userLastName;
	
	@Column(name = "USER_City")
	private String userCity;
	
	@Column(name = "USER_Country")
	private String userCountry;
	
	@Column(name = "USER_PhoneNumber")
	private Long userPhoneNo;
	
	@Column(name = "USER_Gender")
	private String gender;
	
	@Column(name = "USER_Age")
	private Integer age;
	

}
