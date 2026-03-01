package lazy_demo;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
	public EagerBean() {
		System.out.println("Eager Bean Created!");
	}
	public void start() {
		System.out.println("Eager Bean has been started");
	}
}
