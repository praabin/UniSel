package com.prabinsoft.unisel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String phoneNumber;
	private Integer age;
	private String faculty;
	private String dateOfBirth;
	private String country;
	private Double gpa;
	private String program;
	private String institution;
	
	
}
