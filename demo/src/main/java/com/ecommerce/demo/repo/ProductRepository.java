package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product,String>{

}
