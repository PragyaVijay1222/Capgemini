package com.arcana.DoctorServiceCaseStudy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcana.DoctorServiceCaseStudy.dto.DoctorRequestDto;
import com.arcana.DoctorServiceCaseStudy.dto.DoctorResponseDto;
import com.arcana.DoctorServiceCaseStudy.service.DoctorService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class DoctorController {
	
	private final DoctorService service;
	
	@PostMapping("/add")
	public ResponseEntity<DoctorResponseDto> createDoctor(@RequestBody @Valid DoctorRequestDto reqDto){
		
		DoctorResponseDto resDto = service.create(reqDto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(resDto);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<DoctorResponseDto>> getAllDoctors(){
		
		List<DoctorResponseDto> resDtos = service.getAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(resDtos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DoctorResponseDto> getDoctorById(@PathVariable Long id){
		
		DoctorResponseDto resDto = service.getById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<DoctorResponseDto> updateDoctorById(@PathVariable Long id, @RequestBody @Valid DoctorRequestDto reqDto){
		
		DoctorResponseDto resDto = service.upadetById(reqDto, id);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<DoctorResponseDto> deleteDoctorById(@PathVariable Long id){
		
		DoctorResponseDto resDto = service.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
}
