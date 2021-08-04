package com.rns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rns.dao.ProductDao;
import com.rns.entity.Product;

@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Transactional(propagation=Propagation.REQUIRED ,readOnly=false)
	public int saveProduct(Product product) {
		Integer i=  productDao.saveProduct(product);
		return i;
	}

	public List<Product> listProduct() {
		List<Product> product=productDao.listProduct();
		return product;
	}

	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

}
