package org.Arcana.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", initialValue = 100, allocationSize = 1)
    private int id;

    @Column(name="name")
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private StudentIDCards idCard;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="departments_id")
    private Departments department;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name="student_course",joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
	private List<Courses> courses = new ArrayList<>();
    
    public Students() {
    	
    }
    public Students(String name, Departments department, int studentIDCardNumber) {
    	this.name = name;
    	this.idCard = new StudentIDCards();
    	idCard.setCardNumber(studentIDCardNumber);
    	studentIDCardNumber++;
    	this.department = department;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setCourses(List<Courses> courses) {
    	this.courses = courses;
    }
    public void addCourse(Courses course) {
    	this.courses.add(course);
    	course.addStudents(this);
    }
    public String getName() {
    	return this.name;
    }
    public List<Courses> getCourses(){
    	return this.courses;
    }
    public Departments getDepartment() {
    	return this.department;
    }
    public StudentIDCards getIdCard() {
    	return this.idCard;
    }
    public String printCourses() {
    	StringBuilder sb = new StringBuilder();
    	for(Courses course : courses) {
    		sb.append(course.getCourseName());
    		sb.append(" ");
    	}
    	return sb.toString();
    }
    
    @Override
    public String toString() {
    	return "Student ID: " +this.id+" Student Name: "+this.name+" ID Card Number: "+this.idCard.getCardNumber()+"\n Department: "+this.department.getName()+
    			"Courses: "+printCourses();
    }
    
}
