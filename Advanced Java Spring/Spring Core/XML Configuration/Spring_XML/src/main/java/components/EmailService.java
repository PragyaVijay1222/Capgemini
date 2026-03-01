package components;

public class EmailService {
	public EmailService() {
		System.out.println("constructor called");
		
	}
	public void init() {
		System.out.println("init method");
	}
	public void destroy() {
		
		System.out.println("destroy method");
	}
	public void send() {
		System.out.println("through email");
	}

}
