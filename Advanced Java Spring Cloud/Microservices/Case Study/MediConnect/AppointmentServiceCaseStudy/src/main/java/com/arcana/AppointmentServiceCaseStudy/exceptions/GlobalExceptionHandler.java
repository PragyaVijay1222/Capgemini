package com.arcana.AppointmentServiceCaseStudy.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntime(RuntimeException ex){
		return ResponseEntity.badRequest().body(ex.getMessage());
	}
	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<String> handleDoctorNotFound(DoctorNotFoundException ex){
		return ResponseEntity.status(409).body(ex.getMessage());
	}
}
