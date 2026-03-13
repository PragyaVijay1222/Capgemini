package com.arcana.config_server_case_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerCaseStudyApplication.class, args);
	}

}
