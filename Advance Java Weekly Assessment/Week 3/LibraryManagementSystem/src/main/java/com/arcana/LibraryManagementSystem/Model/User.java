package com.arcana.LibraryManagementSystem.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class User {
	
	private Long id;
	
	@NotBlank(message="Name is required")
	@Size(min=3, message="Length of the name should be atleast 3")
	private String name;
	
	@NotBlank(message="Email is required")
	@Email(message="Valid email is required")
	private String email;
	
	@NotBlank(message="Password is required")
	@Size(min=6, message="Length of the password should be atleast 6")
	private String password;
	
	public User() {
		
	}
	
	public User(Long id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		User user = (User) obj;
		return email.equals(user.email) && password.equals(user.password);
	}
}
