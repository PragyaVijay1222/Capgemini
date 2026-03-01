package com.arcana.components;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class RateLimiter {
	
	public RateLimiter() {
		
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Rate limiter started");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Rate limiter ended");
	}
}
