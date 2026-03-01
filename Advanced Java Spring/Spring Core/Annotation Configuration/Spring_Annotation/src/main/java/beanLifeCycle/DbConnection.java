package beanLifeCycle;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DbConnection {
	public DbConnection() {
		System.out.println("DB constructor is being called");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method is being called");
	}
	
	public void executeQuery() {
		System.out.println("Query is being executed");
		System.out.println("Select * from students");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method is being called before object destruction");
	}
}
