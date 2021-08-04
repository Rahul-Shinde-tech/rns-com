package com.rns.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rns.entity.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional(readOnly=false)
	public int saveProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
		return 1;
	}

	public List<Product> listProduct() {
		
		return (List<Product>) hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Product").list();
	}

	public Product seachProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}
	
}
