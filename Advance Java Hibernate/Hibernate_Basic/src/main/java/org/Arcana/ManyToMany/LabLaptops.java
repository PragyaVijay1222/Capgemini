package org.Arcana.ManyToMany;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Lab_Laptops_Table")
public class LabLaptops {
	@Id
	private int id;
	private String brand;
	private String model;
	private int ram;
	
	@ManyToMany(mappedBy="laptops")
	private List<AlienStudents> aliens = new ArrayList<>(); 
	
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
	public List<AlienStudents> getAliens() {
		return this.aliens;
	}
	public void setAliens(List<AlienStudents> aliens) {
		this.aliens = aliens;
	}
	public void addAliens(AlienStudents alien) {
		this.aliens.add(alien);
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+" Model: "+model+" RAM: "+ram;
	}
}

