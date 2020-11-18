package com.mtc.app.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @EqualsAndHashCode @ToString
public class ProductDTO {

	private int id;
	private String name;
	private float price;
	private int quantity;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
}
