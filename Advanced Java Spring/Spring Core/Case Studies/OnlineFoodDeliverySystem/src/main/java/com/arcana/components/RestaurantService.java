package com.arcana.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestaurantService {
	
	private DeliveryService service;
	
	public RestaurantService() {
		
	}

	public DeliveryService getService() {
		return service;
	}
	
	@Autowired
	public void setService(DeliveryService service) {
		this.service = service;
	}
	
	
}
