package com.arcana.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.arcana.Interface.NotificationChannel;


@Component
@Lazy
public class PushNotification implements NotificationChannel{
	
	public PushNotification() {
		
	}

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending push notification: "+message);
		
	}
	
	
}
