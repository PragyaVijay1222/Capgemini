package org.Arcana.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="MenuItem")
public class MenuItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
	@SequenceGenerator(name = "item_seq", sequenceName = "item_sequence", initialValue = 100, allocationSize = 1)
    private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="available")
	private boolean available;
	
	public MenuItem() {};
	
	public MenuItem(String name, double price, String category, boolean available) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.available = available;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public String getCategory() {
		return this.category;
	}
	public boolean getAvailable() {
		return this.available;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setAvailable(boolean val) {
		this.available = val;
	}
	
	@Override
	public String toString() {
		return "Category: "+this.category+" | Name: "+this.name+" | Price: "+this.price+" | Available: "+this.available;
	}
}
