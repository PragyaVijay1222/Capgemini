package com.learning.course_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.course_management_system.dto.CourseRequestDto;
import com.learning.course_management_system.dto.CourseResponseDto;
import com.learning.course_management_system.entity.PageResponse;
import com.learning.course_management_system.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/courses")
@Tag(name="Course Controller", description="Backend API Testing for Course API")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@PostMapping
	@Operation(summary = "Adding Course", description="Adding a new course in the database")
	@ApiResponse(responseCode = "201", description = "Course added successfully")
	public ResponseEntity<CourseResponseDto> createCourse(@RequestBody @Valid CourseRequestDto dto){
		
		CourseResponseDto responseDto = service.createCourse(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
	}
	
	@PutMapping("/{id}")
	@Operation(summary = "Updating Course", description="Updating an existing course in the database")
	@ApiResponse(responseCode = "202", description = "Course updated successfully")
	public ResponseEntity<CourseResponseDto> updateCourse(@PathVariable Long id, @RequestBody @Valid CourseRequestDto dto){
		
		CourseResponseDto responseDto = service.updateCourse(dto, id);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseDto);
	}
	
	@DeleteMapping("/{id}")
	@Operation(summary = "Deleting Course", description="Deleting a course from the database")
	@ApiResponse(responseCode = "200", description = "Course deleted successfully")
	public ResponseEntity<CourseResponseDto> deleteCourse(@PathVariable Long id){
		
		CourseResponseDto responseDto = service.deleteCourse(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(responseDto);
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "Get Course By ID", description="Getting the course from the database")
	@ApiResponse(responseCode = "302", description = "Found course successfully")
	public ResponseEntity<CourseResponseDto> getCourse(@PathVariable Long id){
		
		CourseResponseDto responseDto = service.getCourseById(id);
		
		return ResponseEntity.status(HttpStatus.FOUND).body(responseDto);
	}
	
	@GetMapping
	@Operation(summary = "Pagination", description="Getting all the courses from teh database")
	@ApiResponse(responseCode = "302", description = "Courses displayed successfully")
	public ResponseEntity<PageResponse<CourseResponseDto>> getAllCourses(
			@Parameter(name="Page Number")@RequestParam(defaultValue = "0") int page,
			@Parameter(name="Page Size")@RequestParam(defaultValue = "5") int size,
			@Parameter(name="Sort By")@RequestParam(defaultValue = "id") String sortBy,
			@Parameter(name="Direction")@RequestParam(defaultValue = "asc") String direction){
				
				PageResponse<CourseResponseDto> response = service.getBooks(page, size, sortBy, direction);
				
				return ResponseEntity.status(HttpStatus.FOUND).body(response);
		
		
	}
}
