package com.learning.course_management_system.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class MaterialResponseDto {
	
	@Positive(message="Id is always positive")
	private Long id;
	
	@NotBlank(message="Title should not be blank")
	private String title;
	
	@NotBlank(message="Name should not be blank")
	private String fileName;
	
	@NotBlank(message="FileType should not be blank")
	private String fileType;
	
	private Long fileSize;
	
	@NotBlank(message="UploadDate should not be blank")
	private LocalDateTime uploadDate;
}
