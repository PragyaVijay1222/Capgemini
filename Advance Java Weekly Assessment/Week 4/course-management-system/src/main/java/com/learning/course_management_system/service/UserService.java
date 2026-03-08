package com.learning.course_management_system.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.learning.course_management_system.dto.LoginRequestDto;
import com.learning.course_management_system.dto.RegisterRequestDto;
import com.learning.course_management_system.dto.UserResponseDto;
import com.learning.course_management_system.entity.User;
import com.learning.course_management_system.exception.UserAlreadyExistsException;
import com.learning.course_management_system.exception.WrongCredentialsException;
import com.learning.course_management_system.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final ModelMapper modelMapper;
	private final UserRepository repository;
	
	public UserResponseDto createUser(RegisterRequestDto reqDto) {
		
		if(repository.findByEmail(reqDto.getEmail()).isPresent()) {
			throw new UserAlreadyExistsException("This email is already registered");
		}
		
		User user = modelMapper.map(reqDto, User.class);
		user.setCourses(new ArrayList<>());
		user.setEnrollments(new ArrayList<>());
		user.setCreatedAt(LocalDateTime.now());
		User savedUser = repository.save(user);
		return modelMapper.map(savedUser, UserResponseDto.class);
	}
	
	public UserResponseDto loginUser(LoginRequestDto reqDto) {
		
		String email = reqDto.getEmail();
		String password = reqDto.getPassword();
		
		User  user = repository.findByEmail(email).get();
		
		if(!user.getEmail().equals(email) || !user.getPassword().equals(password)) {
			throw new WrongCredentialsException("Wrong Credentials Entered");
		}
		
		return modelMapper.map(user, UserResponseDto.class);
		
	}
	
	public UserResponseDto fetchUserProfile(Long id) {
		
		User user = repository.findById(id).get();
		
		return modelMapper.map(user, UserResponseDto.class);
	}
	
}
