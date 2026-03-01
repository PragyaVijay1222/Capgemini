package org.Arcana.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptop_Table")
public class Laptop {
	@Id
	private int id;
	private String brand;
	private String model;
	private int ram;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private AlienStudent student;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+" Model: "+model+" RAM: "+ram;
	}
	public AlienStudent getStudent() {
		return student;
	}
	public void setStudent(AlienStudent student) {
		this.student = student;
	}
}
