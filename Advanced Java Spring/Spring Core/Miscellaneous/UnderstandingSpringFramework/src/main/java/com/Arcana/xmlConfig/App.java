package com.Arcana.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //Xml way of configuring context
//		Alien alien = (Alien) context.getBean("alien");
		Alien alien = context.getBean("alien", Alien.class);
		
		alien.setAge(21);
		System.out.println(alien.getAge());
		alien.code();
		
//		Alien alien2 = (Alien) context.getBean("alien");
//		
//		System.out.println(alien2.getAge());
//		alien.code();
	}
}
