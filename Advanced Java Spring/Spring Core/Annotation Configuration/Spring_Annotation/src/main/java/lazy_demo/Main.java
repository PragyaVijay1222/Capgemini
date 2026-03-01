package lazy_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Container Created");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
		
		System.out.println("Container Started");
		LazyBean lazyBean = context.getBean(LazyBean.class);
		lazyBean.start();
		context.close();
	}
}
