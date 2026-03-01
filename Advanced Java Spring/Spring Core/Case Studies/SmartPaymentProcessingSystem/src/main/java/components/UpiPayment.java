package components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UpiPayment implements PaymentService{
	
	private TransactionLogger transactionLogger;
	
	public UpiPayment(TransactionLogger transactionLogger) {
		this.transactionLogger = transactionLogger;
	}
	public void processPayment(double amount) {
		System.out.println("Amount: "+amount+" paid via UPI payment");
	}

}
