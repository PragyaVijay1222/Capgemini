package com.arcana.AppointmentServiceCaseStudy.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AppointmentRequestDto {
	
	@NotBlank(message="Patient name is needed")
	private String patientName;
	
	@Positive(message="Doctor ID is always positive")
	private Long doctorId;
	
	private String status;
	
	private LocalDate appointmentDate;
}
