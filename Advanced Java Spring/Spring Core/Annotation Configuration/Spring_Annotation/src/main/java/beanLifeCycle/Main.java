package beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		System.out.println("Container starting");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		
		System.out.println("Using Bean");
		DbConnection dbConnection = context.getBean(DbConnection.class);
		dbConnection.executeQuery();
		
		System.out.println("Container closing");
		context.close();
	}
}
