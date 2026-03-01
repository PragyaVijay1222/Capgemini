package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor{
	private PaymentService paymentService;
	
	public PaymentProcessor(@Qualifier("upiPayment")PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@Autowired
	private TransactionLogger transactionLogger;
	
	 public void process(double amount) {
		 paymentService.processPayment(amount);
	 }
}
