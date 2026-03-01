package com.Arcana.xmlConfig;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
//	private Laptop laptop;
	private Computer com;
	
	public Alien() {
//		System.out.println("Alien object created");
	}
	
	
	
//	@ConstructorProperties({"age", "laptop"})
//	public Alien(int age, Laptop laptop) {
//		System.out.println("Para constructor called");
//		this.age = age;
//		this.laptop = laptop;
//	}
	
	
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
}
