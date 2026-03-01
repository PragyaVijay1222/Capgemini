package com.arcana.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class DeliveryService {
	
	public DeliveryService() {
		
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Delivery Service Ready");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Delivery Service Closed");
	}
}
