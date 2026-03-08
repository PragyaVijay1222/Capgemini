package com.learning.course_management_system.service;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.learning.course_management_system.dto.ProfilePicDto;
import com.learning.course_management_system.entity.ProfilePicEntity;
import com.learning.course_management_system.entity.User;
import com.learning.course_management_system.repository.ProfilePicRepository;
import com.learning.course_management_system.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfilePicService {
	
	private final ProfilePicRepository picRepository;
	private final ModelMapper modelMapper;
	private final UserRepository repo;
	
	public ProfilePicDto uploadFile(MultipartFile file, Long id) throws IOException{
		
		ProfilePicEntity fileEntity = new ProfilePicEntity();
		fileEntity.setFileName(file.getOriginalFilename());
		fileEntity.setFileType(file.getContentType());
		fileEntity.setFileSize(file.getSize());
		fileEntity.setFileData(file.getBytes());
		
		ProfilePicEntity savedFile = picRepository.save(fileEntity);
		
		User user = repo.findById(id).get();
		user.setProfilePic(savedFile);
		
		return modelMapper.map(savedFile, ProfilePicDto.class);
	}
	
	public ProfilePicEntity downloadFile(Long id) {
		
		User user = repo.findById(id).get();
		Long picId = user.getProfilePic().getId();
		return picRepository.findById(picId).orElseThrow(() -> new RuntimeException("File not found with id: "+id));
	}
}
