package com.learning.course_management_system.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class MaterialUploadDto {
	
	@NotBlank(message="Title should not be blank")
	private String title;
	
	@Positive(message="Id is always positive")
	private Long courseId;
	
	private MultipartFile fileUrl;
}