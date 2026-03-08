package com.learning.course_management_system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.course_management_system.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{
	
	Optional<List<Enrollment>> getByUserId(Long userId);
	Optional<List<Enrollment>> getByCourseId(Long courseId);
}
