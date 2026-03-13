package com.arcana.AppointmentServiceCaseStudy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcana.AppointmentServiceCaseStudy.dto.AppointmentRequestDto;
import com.arcana.AppointmentServiceCaseStudy.dto.AppointmentResponseDto;
import com.arcana.AppointmentServiceCaseStudy.service.AppointmentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/appointments")
public class AppointmentController {
	
	private final AppointmentService service;
	
	@PostMapping("/add")
	@CircuitBreaker(name = "doctorServiceCaseStudy", fallbackMethod = "doctorFallback")
	public ResponseEntity<AppointmentResponseDto> createAppointmnet(@RequestBody @Valid AppointmentRequestDto reqDto){
		
		AppointmentResponseDto resDto = service.create(reqDto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(resDto);
	}
	
	public String doctorFallback(Throwable ex) {
	    return "Doctor service is currently unavailable. Showing cached appointment data.";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<AppointmentResponseDto>> getAllAppointments(){
		
		List<AppointmentResponseDto> resDtos = service.getAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(resDtos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AppointmentResponseDto> getAppointmentById(@PathVariable Long id){
		
		AppointmentResponseDto resDto = service.getById(id);
		
		return ResponseEntity.status(HttpStatus.FOUND).body(resDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<AppointmentResponseDto> cancelAppointment(@PathVariable Long id){
		
		AppointmentResponseDto resDto = service.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
}
