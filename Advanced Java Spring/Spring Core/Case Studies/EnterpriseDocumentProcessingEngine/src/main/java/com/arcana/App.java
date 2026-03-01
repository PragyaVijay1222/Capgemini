package com.arcana;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arcana.components.DocumentEngine;

import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DocumentEngine engine = context.getBean(DocumentEngine.class);
	}
}
