package manyToOne.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    @SequenceGenerator(name = "department_seq", sequenceName = "department_sequence", initialValue = 1, allocationSize = 1)
    private int id;
	
	@Column(name="dept_name")
	private String name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {};
	
	public Department(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public void addEmployee(Employee emp) {
	    employees.add(emp);
	    emp.setDept(this);
	}
	
}
