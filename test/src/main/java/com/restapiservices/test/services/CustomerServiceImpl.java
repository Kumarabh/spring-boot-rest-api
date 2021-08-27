package com.restapiservices.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapiservices.test.entities.Customer;
import com.restapiservices.test.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
		
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return this.repo.getById(id);
	}

	@Override
	public Customer createCustomer(Customer c) {
		// TODO Auto-generated method stub
		return this.repo.save(c);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		Optional<Customer> customerdb = this.repo.findById(c.getCustomerId());
		if(customerdb.isPresent()) {
		    Customer customerUpdate = customerdb.get();
		    customerUpdate.setCustomerName(c.getCustomerName());
		    customerUpdate.setPhoneNo(c.getPhoneNo());
		    
		    this.repo.save(customerUpdate);
		    
		    return customerUpdate;
		}
		return null;
	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
	}

}
