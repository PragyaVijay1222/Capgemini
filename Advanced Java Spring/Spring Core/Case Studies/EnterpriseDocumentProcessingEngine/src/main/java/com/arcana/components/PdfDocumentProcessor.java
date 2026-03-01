package com.arcana.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.arcana.Interface.DocumentProcessor;


@Component
@Primary
public class PdfDocumentProcessor implements DocumentProcessor{
	
	public PdfDocumentProcessor() {
		
	}

	@Override
	public void processDocument(String documentName) {
		System.out.println("Processing pdf document: "+documentName);
		
	}
	
	
}
