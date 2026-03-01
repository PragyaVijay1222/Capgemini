package org.Arcana.entity;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", sequenceName = "course_sequence", initialValue = 1, allocationSize = 1)
    private int id;
	
	@Column(name="courseName")
	private String courseName;
	
	@ManyToMany(mappedBy="courses", fetch=FetchType.LAZY)
	private List<Students> students = new ArrayList<>();
	
	public Courses() {
		
	}
	
	public Courses(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	public int getId() {
		return this.id;
	}
	public List<Students> getStudents(){
		return this.students;
	}
	public void addStudents(Students student) {
		this.students.add(student);
	}
	public void setStudentList(List<Students> students) {
		this.students = students;
	}
	
	
}
