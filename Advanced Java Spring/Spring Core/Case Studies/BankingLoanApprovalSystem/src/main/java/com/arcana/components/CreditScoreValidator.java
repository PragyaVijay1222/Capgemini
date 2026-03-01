package com.arcana.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.arcana.Interface.LoanValidator;

@Component
@Primary
public class CreditScoreValidator implements LoanValidator{
	
	public CreditScoreValidator() {
		
	}

	@Override
	public void validateLoan(double amount) {
		System.out.println("Validating credit score");
		
	}
	
}
