package com.arcana.LibraryManagementSystem.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.arcana.LibraryManagementSystem.Model.User;

@Repository
public class UserRepository {
	
	private List<User> users = new ArrayList<>();
	private Long idCounter = 1L;
	
	public void registerUser(User user) {
		if(user.getId() == null) {
			user.setId(idCounter++);
			users.add(user);
		}
	}
	
	public Optional<User> checkUser(User user){
		return users.stream().filter(u -> u.equals(user)).findFirst();
	}
}
