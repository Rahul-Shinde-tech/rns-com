package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connection.HibernateUtil;
import com.entities.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class AddProducts extends HttpServlet {
	static Logger logger= Logger.getLogger(AddProducts.class);
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<h3> Product Added Sucessfully:");
		//int productId = Integer.parseInt(request.getParameter("product_id"));
		String productName = request.getParameter("product_name");
		int productStock = Integer.parseInt(request.getParameter("product_stock"));
		int productprice = Integer.parseInt(request.getParameter("product_price"));
		
		Product product = new Product();
		//product.setProductId(productId);
		product.setProductName(productName);
		product.setProductStock(productStock);
		product.setPrice(120);
		logger.info("Connection started:");
		SessionFactory factory = HibernateUtil.getFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();
		logger.info("Added Sucessfully");
		
	}
}
