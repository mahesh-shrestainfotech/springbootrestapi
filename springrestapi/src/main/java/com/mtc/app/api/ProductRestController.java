package com.mtc.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.dto.ProductDTO;
import com.mtc.app.service.IProductService;

@RequestMapping("/products")
@RestController
public class ProductRestController {

	@Autowired
	private IProductService productService;
	
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ProductDTO findById(@PathVariable("id")int id) {
		return productService.findById(id);
	}
	
	
}
