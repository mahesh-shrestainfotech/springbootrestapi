package com.mtc.app.service;

import java.util.List;

import com.mtc.app.dto.ProductDTO;

public interface IProductService {
	
	ProductDTO findById(int id);
	ProductDTO save(ProductDTO product);
	List<ProductDTO> findAll();
	ProductDTO update(ProductDTO product);
	void delete(int id);
}
