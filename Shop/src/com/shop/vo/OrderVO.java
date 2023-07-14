package com.shop.vo;

public class OrderVO {

	private int orderno;
	private String orderid;
	private int orderproduct;
	private int ordercount;
	private String orderdate;
	
	//추가필드
	private String name;
	private String prodname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	
	
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	public int getOrderproduct() {
		return orderproduct;
	}
	public void setOrderproduct(int orderproduct) {
		this.orderproduct = orderproduct;
	}
	
	public int getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
	}
	
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String toString() {
		return orderno+","+orderid+","+orderproduct+","+ordercount+","+orderdate;
	
	}

}
