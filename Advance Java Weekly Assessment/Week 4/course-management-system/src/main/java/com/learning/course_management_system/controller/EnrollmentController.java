package com.learning.course_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.course_management_system.dto.EnrollmentRequestDto;
import com.learning.course_management_system.dto.EnrollmentResponseDto;
import com.learning.course_management_system.service.EnrollmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/enrollments")
@Tag(name="Enrollment Controller", description="Backend API Testing for Enrollment")
public class EnrollmentController {
	
	@Autowired
	private EnrollmentService service;
	
	@PostMapping
	@Operation(summary = "Adding Enrollment", description="Adding a new enrollment in the database")
	@ApiResponse(responseCode = "202", description = "Enrollment added successfully")

	public ResponseEntity<EnrollmentResponseDto> addEnrollment(@RequestBody @Valid EnrollmentRequestDto dto){
		
		EnrollmentResponseDto responseDto = service.enrollStudent(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseDto);
	}
	
	@GetMapping("/student/{studentId}")
	@Operation(summary = "Getting List of Enrollments by Student ID", description="Getting list of enrollment from database")
	@ApiResponse(responseCode = "302", description = "Enrollments found successfully")

	public ResponseEntity<List<EnrollmentResponseDto>> getStudent(@PathVariable Long id){
		
		List<EnrollmentResponseDto> responseDto = service.getStudentEnrollment(id);
		
		return ResponseEntity.status(HttpStatus.FOUND).body(responseDto);
	}
	
	@PutMapping("/course/{courseId}")
	@Operation(summary = "Getting List of Enrollments by Course ID", description="Getting list of enrollment from database")
	@ApiResponse(responseCode = "302", description = "Enrollments found successfully")

	public ResponseEntity<List<EnrollmentResponseDto>> updateEnrollmentStatus(@RequestBody @Valid String Status, @RequestBody @Valid double progressPercentage, @PathVariable Long id){
		
		List<EnrollmentResponseDto> responseDto = service.updateProgress(id, Status, progressPercentage);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseDto);
	}
}
