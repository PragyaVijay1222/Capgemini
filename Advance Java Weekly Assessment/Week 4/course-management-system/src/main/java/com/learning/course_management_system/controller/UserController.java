package com.learning.course_management_system.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.learning.course_management_system.dto.LoginRequestDto;
import com.learning.course_management_system.dto.ProfilePicDto;
import com.learning.course_management_system.dto.RegisterRequestDto;
import com.learning.course_management_system.dto.UserResponseDto;
import com.learning.course_management_system.entity.ProfilePicEntity;
import com.learning.course_management_system.service.ProfilePicService;
import com.learning.course_management_system.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@Tag(name="User Controller", description="Backend API Testing for User")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private ProfilePicService pService;
	
	@PostMapping("/auth/register")
	@Operation(summary = "Adding User", description="Adding a new user in the database")
	@ApiResponse(responseCode = "201", description = "User added successfully")

	public ResponseEntity<UserResponseDto> createUser(@RequestBody @Valid RegisterRequestDto dto){
		
		UserResponseDto responseDto = service.createUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
	}
	
	@PostMapping("/auth/login")
	@Operation(summary = "Logging In User", description="Logging in user")
	@ApiResponse(responseCode = "202", description = "Logged in successfully")

	public ResponseEntity<UserResponseDto> loginUser(@RequestBody @Valid LoginRequestDto dto){
		
		UserResponseDto responseDto = service.loginUser(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseDto);
	}
	
	@GetMapping("/users/{id}")
	@Operation(summary = "Getting User by Id", description="Finding user from the database")
	@ApiResponse(responseCode = "302", description = "User found successfully")

	public ResponseEntity<UserResponseDto> getUser(@PathVariable Long id){
		
		UserResponseDto reponseDto = service.fetchUserProfile(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(reponseDto);
	}
	
	@PostMapping("/users/uploadProfilePicture/{id}")
	@Operation(summary = "Adding a Profile Picture (Multipart File)", description="Adding profile picture to the user")
	@ApiResponse(responseCode = "200", description = "Profile picture uploaded successfully")

	public ResponseEntity<ProfilePicDto> uploadFile(@RequestParam("file") MultipartFile file, @PathVariable Long id) throws IOException{
		
		ProfilePicDto uploadedFile = pService.uploadFile(file, id);
		
		return ResponseEntity.ok(uploadedFile);
	}
	
	@GetMapping("/users/download/{id}")
	@Operation(summary = "Getting Profile Picure By User Id", description="Finding the profile picture from the database")
	@ApiResponse(responseCode = "200", description = "Profile picture found successfully")

	public ResponseEntity<Resource> downloadFile(@PathVariable Long id){
		
		
		ProfilePicEntity fileEntity = pService.downloadFile(id);
		ByteArrayResource resource = new ByteArrayResource(fileEntity.getFileData());
		
		return ResponseEntity.ok()
		        .contentType(MediaType.parseMediaType(fileEntity.getFileType()))
		        .header(HttpHeaders.CONTENT_DISPOSITION,
		                "attachment; filename=\"" + fileEntity.getFileName() + "\"")
		        .contentLength(fileEntity.getFileSize())
		        .body(resource);
	}
}
