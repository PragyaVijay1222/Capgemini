package com.arcana.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationChannel;


@Component
@Scope("prototype")
public class SmsNotification implements NotificationChannel{
	
	public SmsNotification() {
		
	}

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending SMS: "+message);
		
	}
	
	
}
