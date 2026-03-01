package com.arcana.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.arcana.Interface.DocumentProcessor;

@Component
@Lazy
public class WordDocumentProcessor implements DocumentProcessor{
	
	public WordDocumentProcessor() {
		
	}

	@Override
	public void processDocument(String documentName) {
		System.out.println("Processing word document: "+documentName);
	}

}
