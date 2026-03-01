package com.Arcana.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	
//	Tightly coupled
//	@Bean
//	public Alien alien() {
//		Alien obj = new Alien();
//		obj.setAge(21);
//		obj.setComputer(desktop());
//		return obj;
//	}
	
	
//	Loosely coupled
//	@Bean
//	public Alien alien(@Autowired Computer com) {
//		Alien obj = new Alien();
//		obj.setAge(21);
//		obj.setComputer(com);
//		return obj;
//	}
	
	
//	Using qualifier
//	@Bean
//	public Alien alien(@Qualifier("desktop") @Autowired Computer com) {
//		Alien obj = new Alien();
//		obj.setAge(21);
//		obj.setComputer(com);
//		return obj;
//	}
	
	
//	Using primary
	@Bean
	public Alien alien(@Autowired Computer com) {
		Alien obj = new Alien();
		obj.setAge(21);
		obj.setComputer(com);
		return obj;
	}
	
	
	@Bean(name= {"desktop", "com1"})
//	@Scope("prototype")
	public Desktop desktop() {
		System.out.println("Desktop bean made");
		return new Desktop();
	}
	
	@Bean(name="laptop")
	@Primary
	public Laptop laptop() {
		System.out.println("Laptop bean made");
		return new Laptop();
	}
	
}
