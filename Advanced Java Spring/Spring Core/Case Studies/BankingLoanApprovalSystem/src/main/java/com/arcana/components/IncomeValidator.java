package com.arcana.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.arcana.Interface.LoanValidator;

@Component
@Scope("prototype")
public class IncomeValidator implements LoanValidator{
	
	public IncomeValidator() {
		
	}

	@Override
	public void validateLoan(double amount) {
		System.out.println("Validating Income");
	}

}
