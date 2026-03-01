package com.arcana.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class AuditService {
	
	public AuditService() {
		
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Initializating method called");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destruction method called");
	}
}
