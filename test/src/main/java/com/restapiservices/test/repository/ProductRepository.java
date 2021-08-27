package com.restapiservices.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiservices.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
