package com.mvc.springmvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.springmvc.Model.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Long>{
	
}