package com.pragya.MarketSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragya.MarketSpring.Model.Product;
import com.pragya.MarketSpring.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private final ProductRepository repository;
	
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public void saveProduct(Product product) {
		repository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return repository.findAll();
	}
	
	public Optional<Product> getProductById(Long id){
		return repository.findById(id);
	}
	
	public void deleteProduct(Long id) {
		repository.deleteById(id);
	}
}
