package com.arcana.AppointmentServiceCaseStudy.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AppointmentResponseDto {
	
	private Long appointmentId;
	private String patientName;
	private Long doctorId;
	private LocalDate appointmentDate;
	private String status;
}
