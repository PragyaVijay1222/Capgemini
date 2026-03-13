package com.arcana.AppointmentServiceCaseStudy.exceptions;

public class DoctorNotFoundException extends RuntimeException{
	public DoctorNotFoundException(String msg) {
		super(msg);
	}
}
