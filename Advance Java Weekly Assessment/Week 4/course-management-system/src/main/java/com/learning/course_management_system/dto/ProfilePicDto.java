package com.learning.course_management_system.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfilePicDto {
	
	private Long id;
	
	private String fileName;
	
	private String fileType;
	
	private Long fileSize;
	
	private LocalDateTime uploadedAt;
}
