package com.arcana.DoctorServiceCaseStudy.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DoctorRequestDto {
	
	@NotBlank(message="Name should not be blank")
	private String name;
	
	@NotBlank(message="Specialization should not be blank")
	private String specialization;
	
	@Positive(message="Experience should be greater than 0")
	private Integer experience;
	
	@NotBlank(message="Hospital name should not be blank")
	private String hospitalName;
	
	@NotBlank(message="Availability should not be blank")
	private String availability;
}
