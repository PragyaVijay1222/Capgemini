package bean_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("bean_scope");
		System.out.println("Singleton Scope");
		
		SingletonBean s1 = context.getBean(SingletonBean.class);
		SingletonBean s2 = context.getBean(SingletonBean.class);
		
		if(s1 == s2) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Both objects are different");
		}
		
		System.out.println("Prototype Scope");
		
		PrototypeBean p1 = context.getBean(PrototypeBean.class);
		PrototypeBean p2 = context.getBean(PrototypeBean.class);
		
		if(p1 == p2) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Both objects are different");
		}
		
	}
}
