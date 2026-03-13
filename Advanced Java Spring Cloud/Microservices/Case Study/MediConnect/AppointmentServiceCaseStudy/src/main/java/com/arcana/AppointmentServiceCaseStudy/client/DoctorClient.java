package com.arcana.AppointmentServiceCaseStudy.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arcana.AppointmentServiceCaseStudy.dto.DoctorResponseDto;


@FeignClient(name="DOCTORSERVICECASESTUDY")
public interface DoctorClient {
	
	@GetMapping("/doctors/{id}")
	DoctorResponseDto getDoctorById(@PathVariable("id") Long id);
	
	
}
