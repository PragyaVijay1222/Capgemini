package com.arcana.ServiceRegistryCaseStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryCaseStudyApplication.class, args);
	}

}
