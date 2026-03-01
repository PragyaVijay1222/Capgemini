package com.Arcana.firstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
//		System.out.println("Hello world");
		
		Alien obj = context.getBean(Alien.class); 
		obj.code();
	}

}
