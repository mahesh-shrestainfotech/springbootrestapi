package com.mtc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.app.dto.ProductDTO;
import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	private IProductRepository productRespository;
	
	@Override
	public ProductDTO findById(int id) {
		Product product = productRespository.findById(id).get();
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(product, productDTO);
		return productDTO;
	}

	@Override
	public ProductDTO save(ProductDTO productDTO) {
		
		Product product = new Product();
		
		BeanUtils.copyProperties(productDTO, product);
		
		ProductDTO productDTO2 = new ProductDTO();
		
		BeanUtils.copyProperties(productRespository.save(product),productDTO2);
		
		return productDTO2;
	}

	@Override
	public List<ProductDTO> findAll() {
		
		List<ProductDTO> productDTOsList = new ArrayList<ProductDTO>();
		
		List<Product> products = productRespository.findAll();
		
		for (Product product : products) {
			ProductDTO  productDTO = new ProductDTO();
			BeanUtils.copyProperties(product, productDTO);
			productDTOsList.add(productDTO);
		}
		
		return productDTOsList;
	}

	@Override
	public ProductDTO update(ProductDTO productDTO) {
		Product product = new Product();
		
		BeanUtils.copyProperties(productDTO, product);
		
		ProductDTO productDTO2 = new ProductDTO();
		
		BeanUtils.copyProperties(productRespository.save(product),productDTO2);
		
		return productDTO2;
	}

	@Override
	public void delete(int id) {
		 productRespository.deleteById(id);
	}
	
	

}
