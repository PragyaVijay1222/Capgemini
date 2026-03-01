package lazy_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyBean {
	
	public LazyBean() {
		System.out.println("Lazy bean created!");
	}
	public void start() {
		System.out.println("Lazy Bean has been started");
	}
}
