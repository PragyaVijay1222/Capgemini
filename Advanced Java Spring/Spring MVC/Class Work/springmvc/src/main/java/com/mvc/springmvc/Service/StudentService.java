package com.mvc.springmvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvc.springmvc.Model.Student;
import com.mvc.springmvc.Repository.StudentDao;

@Service

public class StudentService {
	@Autowired
	private StudentDao StudentDao;
	public void saveStudent(Student student) {
		StudentDao.save(student);
			
	}
}
