package com.learning.course_management_system.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="courseMaterial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String fileName;
	private String fileType;
	private Long fileSize;
	
	@Lob
	@Column(name = "file_data", columnDefinition = "LONGBLOB")
	private byte[] fileUrl;
	private LocalDateTime uploadDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="course_id")
	private Course course;
	
	@PrePersist
	public void setDate() {
		this.uploadDate = LocalDateTime.now();
	}
}
