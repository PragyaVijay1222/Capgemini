package components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor processor = context.getBean(PaymentProcessor.class);
		processor.process(500);
		context.close();
	}
}
