package com.learning.course_management_system.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EnrollmentRequestDto {
	
	@Positive(message="Id is always poitive")
	private Long courseId;
	
	@Positive(message="Id is always positive")
	private Long studentId;
}
