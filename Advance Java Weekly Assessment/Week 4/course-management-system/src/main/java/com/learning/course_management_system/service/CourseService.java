package com.learning.course_management_system.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.learning.course_management_system.dto.CourseRequestDto;
import com.learning.course_management_system.dto.CourseResponseDto;
import com.learning.course_management_system.entity.Course;
import com.learning.course_management_system.entity.PageResponse;
import com.learning.course_management_system.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {
	
	private CourseRepository repository;
	private ModelMapper modelMapper;
	
	public CourseResponseDto createCourse(CourseRequestDto crDto) {
		
		Course course = modelMapper.map(crDto, Course.class);
		course.setEnrollments(new ArrayList<>());
		course.setMaterials(new ArrayList<>());
		Course savedCourse = repository.save(course);
		
		return modelMapper.map(savedCourse, CourseResponseDto.class);
		
	}
	
	public CourseResponseDto updateCourse(CourseRequestDto crDto, Long id) {
		
		Course course = repository.findById(id).get();
		
		course.setDescription(crDto.getDescription());
		course.setPrice(crDto.getPrice());
		course.setDuration(crDto.getDuration());
		course.setLevel(crDto.getLevel());
		
		return modelMapper.map(course, CourseResponseDto.class);
	}
	
	public CourseResponseDto deleteCourse(Long id) {
		
		Course course = repository.findById(id).get();
		repository.deleteById(id);
		
		return modelMapper.map(course, CourseResponseDto.class);
		
	}
	
    public PageResponse<CourseResponseDto> getBooks(int page, int size, String sortBy, String direction) {
		
		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
		
		Pageable pageable = PageRequest.of(page, size, sort);
		
		Page<Course> bookPage = repository.findAll(pageable);
		
		List<CourseResponseDto> dtoList = bookPage.getContent().stream().map(course -> modelMapper.map(course,  CourseResponseDto.class)).toList();
		
		return new PageResponse<>(
				dtoList,
				bookPage.getNumber(),
				bookPage.getSize(),
				bookPage.getTotalElements(),
				bookPage.getTotalPages()
			);
	}
    
    public CourseResponseDto getCourseById(Long id) {
    	
    	Course course = repository.findById(id).get();
    	
    	return modelMapper.map(course, CourseResponseDto.class);
    }
}
