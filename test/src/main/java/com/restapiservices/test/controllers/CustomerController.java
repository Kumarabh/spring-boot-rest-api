package com.restapiservices.test.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapiservices.test.entities.Customer;
import com.restapiservices.test.services.CustomerService;

import java.util.List;
@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		
		return this.service.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable long id) {
		return this.service.getCustomerById( id);
	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer c) {
		return this.service.createCustomer(c);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer c) {
		return this.service.updateCustomer(c);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable long id) {
		
	}
	
	
}
