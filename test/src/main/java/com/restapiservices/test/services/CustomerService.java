package com.restapiservices.test.services;
import java.util.List;

import com.restapiservices.test.entities.Customer;
public interface CustomerService {

	public List<Customer> getAllCustomers();
	public Customer getCustomerById(long id);
	public Customer createCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	public void deleteCustomer(long id);
	
}
