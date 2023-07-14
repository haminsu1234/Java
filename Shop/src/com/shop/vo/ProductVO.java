package com.shop.vo;

public class ProductVO {
	
	private int prodno;
	private String prodname;
	private int stock;
	private int price;
	private String company;
	
	public int getProdno() {
		return prodno;
	}
	public void setProdno(int prodno) {
		this.prodno = prodno;
	}
	
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toString() {
			
			return prodno+","+prodname+","+stock+","+price+","+company;
		
	}

}
