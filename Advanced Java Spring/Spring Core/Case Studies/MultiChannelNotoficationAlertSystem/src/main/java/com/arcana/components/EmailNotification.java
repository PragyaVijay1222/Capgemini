package com.arcana.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationChannel;

@Component
@Primary
public class EmailNotification implements NotificationChannel{
	
	public EmailNotification() {
		
	}

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending Email: "+message);
		
	}
	
	
}
