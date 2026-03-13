package com.arcana.AppointmentServiceCaseStudy.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.arcana.AppointmentServiceCaseStudy.client.DoctorClient;
import com.arcana.AppointmentServiceCaseStudy.dto.AppointmentRequestDto;
import com.arcana.AppointmentServiceCaseStudy.dto.AppointmentResponseDto;
import com.arcana.AppointmentServiceCaseStudy.dto.DoctorResponseDto;
import com.arcana.AppointmentServiceCaseStudy.entity.Appointment;
import com.arcana.AppointmentServiceCaseStudy.exceptions.DoctorNotFoundException;
import com.arcana.AppointmentServiceCaseStudy.repository.AppointmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentService {
	
	private final AppointmentRepository repo;
	private final ModelMapper modelMapper;
	private final DoctorClient doctorClient;
	
	public AppointmentResponseDto create(AppointmentRequestDto reqDto) {
		
		DoctorResponseDto docDto = doctorClient.getDoctorById(reqDto.getDoctorId());

		if (docDto == null) {
		    throw new DoctorNotFoundException("Doctor not found, can't create appointment");
		}
		
		Appointment appointment = modelMapper.map(reqDto, Appointment.class);
		appointment.setAppointmentId(null);
		repo.save(appointment);
		
		return modelMapper.map(appointment, AppointmentResponseDto.class);
	}
	
	public List<AppointmentResponseDto> getAll() {
		
		List<Appointment> appointments = repo.findAll();
		List<AppointmentResponseDto> resDtos = appointments.stream().map(a -> modelMapper.map(a, AppointmentResponseDto.class)).toList();
		
		return resDtos;
	}
	
	public AppointmentResponseDto getById(Long id) {
		
		Appointment appointment = repo.findById(id).get();
		
		return modelMapper.map(appointment, AppointmentResponseDto.class);
	}
	
	public AppointmentResponseDto deleteById(Long id) {
		
		Appointment appointment = repo.findById(id).get();
		repo.deleteById(id);
		
		return modelMapper.map(appointment, AppointmentResponseDto.class);
	}
}
