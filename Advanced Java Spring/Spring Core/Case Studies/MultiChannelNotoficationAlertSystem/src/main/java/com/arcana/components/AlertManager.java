package com.arcana.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AlertManager {
	
	private @Qualifier RateLimiter limiter;
	private AlertAuditService service;
	
	public AlertManager() {
		
	}
	
	@Autowired
	public AlertManager(RateLimiter limiter) {
		this.limiter = limiter;
	}

	public RateLimiter getLimiter() {
		return limiter;
	}

	public void setLimiter(RateLimiter limiter) {
		this.limiter = limiter;
	}

	public AlertAuditService getService() {
		return service;
	}
	
	@Autowired
	public void setService(AlertAuditService service) {
		this.service = service;
	}
	
	
}
