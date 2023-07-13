package com.shop.vo;

public class OrderVO {

	private int orderno;
	private String orderid;
	private int orderproduct;
	private int ordercount;
	private String orderdate;
	
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
	
}
