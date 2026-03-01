package com.Arcana.javaConfigWithComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Desktop desktop = context.getBean("com1",Desktop.class);
		
//		Desktop desktop1 = context.getBean(Desktop.class);
//		desktop1.compile();
//		
//		Desktop desktop2 = context.getBean(Desktop.class);
//		desktop2.compile();
		
		Alien alien = context.getBean(Alien.class);
		alien.code();
	}
}
