package com.shop.db;

public class SQL {
	//CUSTOMER
	public final static String SELECT_CUSTOMER = "SELECT * FROM `CUSTOMER` WHERE `CUSTID` =?";
	public final static String SELECT_CUSTOMERS = "";
	public final static String INSERT_CUSTOMER = "INSERT INTO `CUSTOMER` VALUES (?,?,?,?,NOW())";
	public final static String UPDATE_CUSTOMER = "";
	public final static String DELETE_CUSTOMER = "";
	
	public final static String SELECT_PRODUCT = "SELECT * FROM `PRODUCT` WHERE PRODNO =?";
	public final static String SELECT_PRODCUTS = "SELECT * FROM `PRODUCT`";
	public final static String INSERT_PRODUCT = "INSERT INTO `CUSTOMER` VALUES (?,?,?,?,NOW())";
	public final static String UPDATE_PRODCUT = "";
	public final static String DELETE_PRODCUT = "";
	
	public final static String INSERT_ORDER ="INSERT INTO `ORDER` SET "
											+ "`orderid`=?,"
											+ "`orderproduct`=?,"
											+ "`ordercount`=?,`orderdate` "
											+ "VALUES (?,?,?,NOW())";
	
	public final static String UPDATE_PRODUCT_STOCK = "UPDATE `PRODUCT` SET `STOCK` = `STOCK`-? WHERE `PRODNO`=?";
	
	public final static String SELECT_ORDERS = "SELECT "
												+ "	a.*, "
												+ "	b.`name`,"
												+ "	c.`prodname` "
												+ "FROM `order` AS a "
												+ "JOIN `customer` AS b ON a.orderid=b.custid "
												+ "JOIN `product` AS c ON a.orderproduct =c.prodno "
												+ "WHERE `orderid` = ?";
										

	
	//ORDER
	
	//PRODUCT
}
