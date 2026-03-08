package com.learning.course_management_system.exception;

public class WrongCredentialsException extends RuntimeException{
	public WrongCredentialsException(String msg) {
		super(msg);
	}
}
