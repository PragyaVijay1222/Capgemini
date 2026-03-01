package com.arcana.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcana.Interface.LoanValidator;

@Component
public class LoanService {
	
	private LoanValidator validator;
	private AuditService service;
	
	public LoanService() {
		
	}
	
	@Autowired
	public LoanService(LoanValidator validator) {
		this.setValidator(validator);
	}

	public LoanValidator getValidator() {
		return validator;
	}

	public void setValidator(LoanValidator validator) {
		this.validator = validator;
	}

	public AuditService getService() {
		return service;
	}
	
	@Autowired
	public void setService(AuditService service) {
		this.service = service;
	}
	
}
