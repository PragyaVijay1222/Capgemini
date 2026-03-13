package com.arcana.DoctorServiceCaseStudy.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.arcana.DoctorServiceCaseStudy.dto.DoctorRequestDto;
import com.arcana.DoctorServiceCaseStudy.dto.DoctorResponseDto;
import com.arcana.DoctorServiceCaseStudy.entity.Doctor;
import com.arcana.DoctorServiceCaseStudy.repository.DoctorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorService {
	
	private final DoctorRepository repo;
	private final ModelMapper modelMapper;
	
	public DoctorResponseDto create(DoctorRequestDto reqDto) {

		Doctor doctor = modelMapper.map(reqDto, Doctor.class);
		repo.save(doctor);
		
		return modelMapper.map(doctor, DoctorResponseDto.class);
	}
	
	public List<DoctorResponseDto> getAll(){
		
		List<Doctor> doctors = repo.findAll();
		List<DoctorResponseDto> resDto = doctors.stream().map(d -> modelMapper.map(d, DoctorResponseDto.class)).toList();
		
		return resDto;
	}
	
	public DoctorResponseDto getById(Long id) {
		
		return modelMapper.map(repo.findById(id).get(), DoctorResponseDto.class);
	}
	
	public DoctorResponseDto upadetById(DoctorRequestDto reqDto,Long id) {
		
		Doctor doctor = repo.findById(id).get();
		doctor.setAvailability(reqDto.getAvailability());
		doctor.setExperience(reqDto.getExperience());
		doctor.setHospitallName(reqDto.getHospitalName());
		doctor.setName(reqDto.getName());
		doctor.setSpecialization(reqDto.getSpecialization());
		
		return modelMapper.map(doctor, DoctorResponseDto.class);
	}
	
	public DoctorResponseDto deleteById(Long id) {
		
		Doctor doctor = repo.findById(id).get();
		repo.deleteById(id);
		
		return modelMapper.map(doctor, DoctorResponseDto.class);
		
	}
}
