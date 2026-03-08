package com.learning.course_management_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.course_management_system.entity.Course;
import com.learning.course_management_system.entity.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long>{
	
	Optional<CourseMaterial> findByCourse(Course course);
}
