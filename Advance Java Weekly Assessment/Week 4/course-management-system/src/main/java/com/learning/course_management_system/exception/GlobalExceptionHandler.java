package com.learning.course_management_system.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntime(RuntimeException ex){
		return ResponseEntity.badRequest().body(ex.getMessage());
	}
	@ExceptionHandler(UserAlreadyExistsException.class)
	public ResponseEntity<String> handleExistingUser(UserAlreadyExistsException ex){
		return ResponseEntity.status(409).body(ex.getMessage());
	}
	@ExceptionHandler(WrongCredentialsException.class)
	public ResponseEntity<String> handleWrongCredentials(WrongCredentialsException ex){
		return ResponseEntity.status(409).body(ex.getMessage());
	}
}

