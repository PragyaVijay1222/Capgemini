package com.learning.course_management_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequestDto {
	
	@NotBlank(message="Email should not be blank")
	private String email;
	
	@NotBlank(message="Password should not be blank")
	@Size(min=6, message="Password must be atleast 6 in length")
	private String password;
}
