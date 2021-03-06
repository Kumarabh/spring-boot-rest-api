package com.restapiservices.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapiservices.test.entities.Product;
import com.restapiservices.test.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repo;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> p = this.repo.findAll();
		return p;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		Optional <Product> productdb = this.repo.findById(id);
		if(productdb.isPresent()) {
			return productdb.get();
		}
		return null;
	}

	@Override
	public Product createProduct(Product p) {
		// TODO Auto-generated method stub
		return this.repo.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		Optional<Product> productdb = this.repo.findById(p.getProductId());
		
		if(productdb.isPresent()) {
		   Product productUpdate = productdb.get();
		   productUpdate.setProductName(p.getProductName());
		   productUpdate.setProductCode(p.getProductCode());
		   this.repo.save(productUpdate);
		   return productUpdate;
		   
		   
		}
		
		return null;
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		
	}
}