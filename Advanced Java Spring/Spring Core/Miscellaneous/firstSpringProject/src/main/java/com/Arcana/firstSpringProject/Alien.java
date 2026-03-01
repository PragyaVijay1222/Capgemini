package com.Arcana.firstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                   //Tells spring that it is it's responsibility to create and maintain the object 
public class Alien {
	
	@Autowired
	Laptop laptop;
	
	public void code() {
		laptop.compile();
	}
}
