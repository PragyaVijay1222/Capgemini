package com.arcana.LibraryManagementSystem.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arcana.LibraryManagementSystem.Model.User;
import com.arcana.LibraryManagementSystem.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private final UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public void signIn(User user) {
		repository.registerUser(user);
	}
	
	public Optional<User> logIn(User user) {
		return repository.checkUser(user);
	}
}
