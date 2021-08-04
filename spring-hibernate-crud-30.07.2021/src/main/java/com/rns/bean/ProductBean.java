package com.rns.bean;


public class ProductBean {

	private int productId;
	private String productName;
	private int productQuantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + "]";
	}
	public ProductBean(int productId, String productName, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
