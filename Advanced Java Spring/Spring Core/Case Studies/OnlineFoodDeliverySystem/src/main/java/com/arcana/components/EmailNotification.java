package com.arcana.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationService;

@Component
@Primary
public class EmailNotification implements NotificationService{
	
	public EmailNotification() {
		
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Email Notification");		
	}
	
	
}
