package com.arcana.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationService;

@Component
public class OrderService {
	
	public OrderService() {
		
	}
	
	@Autowired
	public OrderService(NotificationService nService) {
		this.nService = nService;
	}
	
	private NotificationService nService;
	
	
	@Autowired
	private RestaurantService rService;
	
	public NotificationService getnService() {
		return nService;
	}

	public void setnService(NotificationService nService) {
		this.nService = nService;
	}

	public RestaurantService getrService() {
		return rService;
	}

	public void setrService(RestaurantService rService) {
		this.rService = rService;
	}
}
