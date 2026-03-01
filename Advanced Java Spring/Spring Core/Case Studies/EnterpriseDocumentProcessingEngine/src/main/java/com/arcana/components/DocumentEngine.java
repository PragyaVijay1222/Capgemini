package com.arcana.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcana.Interface.DocumentProcessor;

@Component
public class DocumentEngine {
	
	private DocumentProcessor processor;
	private AuditService aService;
	
	@Autowired
	private StorageService sService;
	
	public DocumentEngine() {
		
	}
	
	@Autowired
	public DocumentEngine(DocumentProcessor processor) {
		this.processor = processor;
	}

	public DocumentProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(DocumentProcessor processor) {
		this.processor = processor;
	}

	public AuditService getaService() {
		return aService;
	}
	
	@Autowired
	public void setaService(AuditService aService) {
		this.aService = aService;
	}

	public StorageService getsService() {
		return sService;
	}

	public void setsService(StorageService sService) {
		this.sService = sService;
	}
	
	
}
