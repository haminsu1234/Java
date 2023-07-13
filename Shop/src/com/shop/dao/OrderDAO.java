package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {
	
	private static OrderDAO instance = new OrderDAO();
	
	public static OrderDAO getInstance () {
		return instance;
	}
	
	public int insertOrder (OrderVO vo) {
		return 0;
	}
	
	public OrderVO selectOrder (int orderno) {
		return null;
	}
	
	public List<OrderVO> selectOrders (OrderVO vo) {
		return null;
	}
	
	public int updateOrder (OrderVO vo) {
		return 0;
	}
		
	public int deleteOrder (OrderVO vo) {
		return 0;		
	}
	
}
