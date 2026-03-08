package com.learning.course_management_system.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CourseResponseDto {
	
	@Positive(message="Id is always positive")
	private Long id;
	
	@NotBlank(message="Title should not be blank")
	private String title;
	
	@NotBlank(message="Description should not be blank")
	private String description;
	
	@Min(value=10, message="Minimum price is 10")
	private double price;
	
	@Min(value=45, message="Minimum duration is 45 days")
	private int duration;
	
	@Positive(message="Level must be positive")
	private int level;
	
	@NotBlank(message="Instructor name should not be blank")
	private String instructorName;
	
	private LocalDateTime createdAt;
}
