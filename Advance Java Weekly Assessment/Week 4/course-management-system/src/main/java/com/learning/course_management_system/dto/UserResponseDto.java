package com.learning.course_management_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UserResponseDto {
	
	@Positive(message="Id is always positive")
	private Long id;
	
	@NotBlank(message="Name should not be blank")
	private String fullName;
	
	@NotBlank(message="Email should not be blank")
	private String email;
	
	@NotBlank(message="Role should not be blank")
	private String role;
	
	private byte[] profilePicture;
}
