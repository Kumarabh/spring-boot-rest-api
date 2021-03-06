package com.restapiservices.test.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapiservices.test.entities.Product;
import com.restapiservices.test.services.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
	 List<Product> p =	this.service.getAllProducts();
	 return p;
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable long id) {
		Product p = this.service.getProductById(id);
		return p;
	}
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product p) {
		return this.service.createProduct(p);
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product p) {
		return this.service.updateProduct(p);
	}

	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable long id) {
		this.service.deleteProduct(id);
	}
}
