package com.restapiservices.test.services;
import java.util.List;

import com.restapiservices.test.entities.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	public Product getProductById(long id);
	public Product createProduct(Product p);
	public Product updateProduct(Product p);
	public void deleteProduct(long id);
}
