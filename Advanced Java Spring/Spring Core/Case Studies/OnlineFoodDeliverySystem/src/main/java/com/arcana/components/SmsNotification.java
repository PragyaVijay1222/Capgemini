package com.arcana.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationService;

@Component
@Lazy
public class SmsNotification implements NotificationService{
	
	public SmsNotification() {
		
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS Notification");
		
	}

}
