package com.arcana.components;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AuditService {
	
	public AuditService() {
		
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Audit service started");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Audit service ended");
	}
}
