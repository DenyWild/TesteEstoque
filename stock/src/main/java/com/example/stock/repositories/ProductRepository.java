package com.example.stock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
