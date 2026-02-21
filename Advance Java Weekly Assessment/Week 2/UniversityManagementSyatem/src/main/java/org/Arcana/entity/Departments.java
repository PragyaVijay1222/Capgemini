package org.Arcana.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="departments")
public class Departments {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    @SequenceGenerator(name = "department_seq", sequenceName = "department_sequence", initialValue = 1, allocationSize = 1)
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Students> students = new ArrayList<>();
    
    public Departments() {
    	
    }
    public Departments(String name) {
    	this.name = name;
    }
    
    public void addStudent(Students student) {
    	this.students.add(student);
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setStudents(List<Students> students) {
    	this.students = students;
    }
    
    public String getName() {
    	return this.name;
    }
    public List<Students> getStudents(){
    	return this.students;
    }
    public int getId() {
    	return this.id;
    }
	
}
