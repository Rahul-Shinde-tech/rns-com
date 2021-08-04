package com.rns.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rns.bean.ProductBean;
import com.rns.entity.Product;
import com.rns.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	private ProductBean productBean;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listProducts(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("prodList", preparedBeanModel(productService.listProduct()));
		return new ModelAndView("home",modelMap);
		/*List<Product> productList = productService.listProduct();
		model.addObject("prodList",productList);
		model.setViewName("home");
		return model;*/
	}

	private Object preparedBeanModel(List<Product> listProduct) {
		List<ProductBean> productBeans =null;
		if(listProduct!=null && !listProduct.isEmpty()) {
			productBeans = new ArrayList<ProductBean>();
			ProductBean productBean =null;
			for(Product product:listProduct) {
				productBean = new ProductBean();
				productBean.setProductId(product.getProductId());
				productBean.setProductName(product.getProductName());
				productBean.setProductQuantity(product.getProductQuantity());
				
				productBeans.add(productBean);
			}
			
		}
		return productBeans;
	}

	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	public ModelAndView newProduct(ModelAndView model) {
		Product product = new Product();
		model.addObject("product", product);
		model.setViewName("productForm");
		return model;
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute ProductBean productBean, BindingResult result) {
		Product product = preparedModel(productBean);
		productService.saveProduct(product);
		return new ModelAndView("redirect:/");

	}

	private Product preparedModel(ProductBean productBean2) {
		Product product = new Product();
		product.setProductName(productBean2.getProductName());
		product.setProductQuantity(productBean2.getProductQuantity());
		product.setProductId(productBean2.getProductId());
		return product;
	}
	
	 
}
