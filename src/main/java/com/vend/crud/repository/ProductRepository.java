package com.vend.crud.repository;

import com.vend.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Product findByName(String name);
}
