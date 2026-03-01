package org.Arcana.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Multiple_Laptop_Table")
public class MultipleLaptops {
	@Id
	private int id;
	private String brand;
	private String model;
	private int ram;
	
	@ManyToOne
	private AlienStudentsMultipleLaptops aliens; 
	
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
	public AlienStudentsMultipleLaptops getAliens() {
		return this.aliens;
	}
	public void setAliens(AlienStudentsMultipleLaptops aliens) {
		this.aliens = aliens;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+" Model: "+model+" RAM: "+ram;
	}
}
