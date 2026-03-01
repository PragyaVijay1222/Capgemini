package com.arcana.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.arcana.Interface.DocumentProcessor;

@Component
@Scope("prototype")
public class XmlDocumentProcessor implements DocumentProcessor{
	
	public XmlDocumentProcessor() {
		
	}

	@Override
	public void processDocument(String documentName) {
		System.out.println("Processing xml document: "+documentName);
		
	}
	
	
}
