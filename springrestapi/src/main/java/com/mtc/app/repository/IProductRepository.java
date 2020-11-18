package com.mtc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtc.app.entity.Product;

public interface IProductRepository extends JpaRepository<Product,Integer>{

}
