package manyToMany.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="subjects")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_seq")
    @SequenceGenerator(name = "subject_seq", sequenceName = "subject_sequence", initialValue = 100, allocationSize = 1)
    private int id;
	
	@Column(name="name", unique=true)
	private String name;
	
	@ManyToMany(mappedBy="subjects")
	private List<Student> students = new ArrayList<>();
	
	public Subject() {};
	public Subject(String name) {
		this.name = name;
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(List<Student> std) {
		this.students = std;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Subject)) return false;
	    Subject other = (Subject) o;
	    return id != 0 && id == other.id;
	}

	@Override
	public int hashCode() {
	    return getClass().hashCode();
	}
	
}
