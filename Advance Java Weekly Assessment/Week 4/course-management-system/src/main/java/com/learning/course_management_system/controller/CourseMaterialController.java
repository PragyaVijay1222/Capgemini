package com.learning.course_management_system.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.course_management_system.dto.MaterialResponseDto;
import com.learning.course_management_system.dto.MaterialUploadDto;
import com.learning.course_management_system.entity.CourseMaterial;
import com.learning.course_management_system.service.CourseMaterialService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/materials")
@Tag(name="Course Material Controller", description="Backend API Testing for Course Material API")
public class CourseMaterialController {
	
	@Autowired
	private CourseMaterialService service;
	
	@PostMapping("/upload")
	@Operation(summary = "Adding Material", description="Adding a multipart file in the database")
	@ApiResponse(responseCode = "200", description = "Material added successfully")
	public ResponseEntity<MaterialResponseDto> uploadFile(@RequestParam("file") MaterialUploadDto file) throws IOException{
		
		MaterialResponseDto uploadedFile = service.uploadFile(file);
		
		return ResponseEntity.ok(uploadedFile);
	}
	
	@GetMapping("/{id}/download")
	@Operation(summary = "Downloading Material By Id", description="Downloading the material by CourseMaterial id")
	@ApiResponse(responseCode = "200", description = "Material downloaded successfully")
	public ResponseEntity<Resource> downloadFile(@PathVariable Long id){
		
		CourseMaterial fileEntity = service.downloadFile(id);
		ByteArrayResource resource = new ByteArrayResource(fileEntity.getFileUrl());
		
		return ResponseEntity.ok()
		        .contentType(MediaType.parseMediaType(fileEntity.getFileType()))
		        .header(HttpHeaders.CONTENT_DISPOSITION,
		                "attachment; filename=\"" + fileEntity.getFileName() + "\"")
		        .contentLength(fileEntity.getFileSize())
		        .body(resource);
		
	}
	
	@GetMapping("/course/{courseId}")
	@Operation(summary = "Downloading Material By Course Id", description="Downloading the material by Course id")
	@ApiResponse(responseCode = "200", description = "Material downloaded successfully")
	public ResponseEntity<Resource> downloadFileByCourse(@PathVariable Long id){
		
		CourseMaterial fileEntity = service.getCourseMaterial(id);
		ByteArrayResource resource = new ByteArrayResource(fileEntity.getFileUrl());
		
		return ResponseEntity.ok()
		        .contentType(MediaType.parseMediaType(fileEntity.getFileType()))
		        .header(HttpHeaders.CONTENT_DISPOSITION,
		                "attachment; filename=\"" + fileEntity.getFileName() + "\"")
		        .contentLength(fileEntity.getFileSize())
		        .body(resource);
		
	}
}
