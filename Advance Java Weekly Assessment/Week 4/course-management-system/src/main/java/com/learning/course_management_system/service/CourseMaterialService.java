package com.learning.course_management_system.service;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.learning.course_management_system.dto.MaterialResponseDto;
import com.learning.course_management_system.dto.MaterialUploadDto;
import com.learning.course_management_system.entity.Course;
import com.learning.course_management_system.entity.CourseMaterial;
import com.learning.course_management_system.repository.CourseMaterialRepository;
import com.learning.course_management_system.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseMaterialService {
	
	private final CourseMaterialRepository repo;
	private final CourseRepository cRepo;
	private final ModelMapper modelMapper;
	
	
	public MaterialResponseDto uploadFile(MaterialUploadDto file) throws IOException{
	
	CourseMaterial fileEntity = new CourseMaterial();
	fileEntity.setFileName(file.getFileUrl().getOriginalFilename());
	fileEntity.setFileType(file.getFileUrl().getContentType());
	fileEntity.setFileSize(file.getFileUrl().getSize());
	fileEntity.setFileUrl(file.getFileUrl().getBytes());
	Course course = cRepo.findById(file.getCourseId()).get();
	fileEntity.setCourse(course);
	fileEntity.setTitle(file.getTitle());
	CourseMaterial savedFile = repo.save(fileEntity);
	
	return modelMapper.map(savedFile, MaterialResponseDto.class);
}
	
	public CourseMaterial downloadFile(Long id) {
	CourseMaterial fileEntity = repo.findById(id).orElseThrow(() -> new RuntimeException("File not found with id: "+id));
	
	return fileEntity;
}
	public CourseMaterial getCourseMaterial(Long id) {
		
		Course course = cRepo.findById(id).get();
		
		CourseMaterial material = repo.findByCourse(course).get();
		
		return material;
	}
}
