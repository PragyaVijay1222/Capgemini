package com.learning.course_management_system.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EnrollmentResponseDto {
	
	@Positive(message="Id is always positive")
	private Long id;
	
	@NotBlank(message="Title should not be blank")
	private String courseTitle;
	
	@NotBlank(message="Name should not be blank")
	private String studentName;
	
	@NotBlank(message="Status should not be blank")
	private String status;
	
	@Min(value=0, message="Minimum percentage is 0")
	private double progressPercentage;
	
	private LocalDateTime enrollmentDate;
}
