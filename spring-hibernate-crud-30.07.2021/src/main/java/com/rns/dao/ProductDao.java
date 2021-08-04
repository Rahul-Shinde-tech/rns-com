package com.rns.dao;

import java.util.List;
import com.rns.entity.Product;

public interface ProductDao {
	
	public int saveProduct(Product product);
	
	public List<Product> listProduct();
	
	public Product seachProduct(int productId);
	
	public void deleteProduct(int productId);
	
}
