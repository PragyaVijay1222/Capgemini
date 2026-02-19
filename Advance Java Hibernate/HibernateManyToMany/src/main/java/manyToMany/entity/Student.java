package manyToMany.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", initialValue = 100, allocationSize = 1)
    private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="student_subject",joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
	List<Subject> subjects = new ArrayList<>();
	
	public Student() {};
	
	public Student(String name, int age, List<Subject> course) {
		this.name = name;
		this.age = age;
		this.subjects = course;
	}
	
	public void setSubject(List<Subject> subject) {
		this.subjects = subject;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public List<Subject> getSubjects(){
		return this.subjects;
	}
	public void addSubject(Subject subject) {
	    subjects.add(subject);
	    subject.getStudents().add(this);
	}

	public void removeSubject(Subject subject) {
	    subjects.remove(subject);
	    subject.getStudents().remove(this);
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Student)) return false;
	    Student other = (Student) o;
	    return id != 0 && id == other.id;
	}

	@Override
	public int hashCode() {
	    return getClass().hashCode();
	}
}
