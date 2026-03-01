package components;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TransactionLogger {

	
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("Logger initialized");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("Logger destroyed");
	}
	
}
