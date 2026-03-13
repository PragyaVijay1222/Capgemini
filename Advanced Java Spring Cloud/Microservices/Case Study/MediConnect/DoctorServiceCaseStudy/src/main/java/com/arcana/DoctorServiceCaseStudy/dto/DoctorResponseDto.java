package com.arcana.DoctorServiceCaseStudy.dto;

import lombok.Data;

@Data
public class DoctorResponseDto {
	
	private Long id;
	
	private String name;
	
	private String specialization;
	
	private Integer experience;
	
	private String hospitalName;
	
	private String availability;
}
