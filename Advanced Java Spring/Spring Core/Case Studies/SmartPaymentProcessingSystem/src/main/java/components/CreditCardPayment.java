package components;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Primary
public class CreditCardPayment implements PaymentService{
	
	private TransactionLogger transactionLogger;
	
	public CreditCardPayment(TransactionLogger transactionLogger) {
		this.transactionLogger = transactionLogger;
	}
	public void processPayment(double amount) {
		System.out.println("Amount: "+amount+" paid via Credit Card");
		
	}

}
