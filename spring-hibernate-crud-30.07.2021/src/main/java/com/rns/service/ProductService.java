package com.rns.service;

import java.util.List;

import com.rns.entity.Product;

public interface ProductService {
	
	public int saveProduct(Product product);
	
	public List<Product> listProduct();
	
	public Product searchProduct(int productId);
	
	public void deleteProduct(int productId);
}
