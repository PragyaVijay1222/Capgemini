package com.learning.course_management_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CourseRequestDto {
	
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
}
