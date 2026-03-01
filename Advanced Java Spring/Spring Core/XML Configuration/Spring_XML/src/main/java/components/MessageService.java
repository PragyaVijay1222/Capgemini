package components;

public class MessageService {
	EmailService emailService;
	public void setEmailService(EmailService emailService) {
		this.emailService=emailService;
	}
	public void message() {
		System.out.println("message sent");
		emailService.send();
	}

}
