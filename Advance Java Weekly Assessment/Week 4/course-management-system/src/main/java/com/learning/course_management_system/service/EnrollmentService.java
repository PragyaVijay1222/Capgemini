package com.learning.course_management_system.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.learning.course_management_system.dto.EnrollmentRequestDto;
import com.learning.course_management_system.dto.EnrollmentResponseDto;
import com.learning.course_management_system.entity.Course;
import com.learning.course_management_system.entity.Enrollment;
import com.learning.course_management_system.entity.User;
import com.learning.course_management_system.repository.CourseRepository;
import com.learning.course_management_system.repository.EnrollmentRepository;
import com.learning.course_management_system.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnrollmentService {
	
	private final CourseRepository cRepo;
	private final EnrollmentRepository eRepo;
	private final UserRepository uRepo;
	private final ModelMapper modelMapper;
	
	public EnrollmentResponseDto enrollStudent(EnrollmentRequestDto req) {
		
		Long userId = req.getStudentId();
		Long courseId = req.getCourseId();
		
		User user = uRepo.findById(userId).get();
		Course course = cRepo.findById(courseId).get();
		
		Enrollment enrollment = modelMapper.map(req, Enrollment.class);
		
		enrollment.setCourse(course);
		enrollment.setUser(user);
		
		eRepo.save(enrollment);
		
		return modelMapper.map(enrollment, EnrollmentResponseDto.class);
		
	}
	
	public List<EnrollmentResponseDto> getStudentEnrollment(Long id) {
		
		List<Enrollment> enrollment = eRepo.getByUserId(id).get();
		
		List<EnrollmentResponseDto> response = (List<EnrollmentResponseDto>) enrollment.stream().map(e -> modelMapper.map(e, EnrollmentResponseDto.class)).toList();
		
		return response;
	}
	
	public List<EnrollmentResponseDto> updateProgress(Long id, String Status, double progressPercentage) {
		
		List<Enrollment> enrollment = eRepo.getByCourseId(id).get();
		
		for(Enrollment e : enrollment) {
			e.setStatus(Status);
			e.setProgressPercentage(progressPercentage);
		}
		
		List<EnrollmentResponseDto> response = (List<EnrollmentResponseDto>) enrollment.stream().map(e -> modelMapper.map(e, EnrollmentResponseDto.class)).toList();
		
		
		return response;
	}
}
