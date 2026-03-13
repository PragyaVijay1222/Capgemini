package com.arcana.AppointmentServiceCaseStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppointmentServiceCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServiceCaseStudyApplication.class, args);
	}

}
