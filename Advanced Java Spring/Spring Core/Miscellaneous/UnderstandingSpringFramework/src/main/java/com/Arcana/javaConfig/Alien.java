package com.Arcana.javaConfig;

public class Alien {
	
	private int age;
	private Computer computer;
	
	public Alien() {
	}
	
	
	public void code() {
		System.out.println("Coding");
		computer.compile();
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}

}
