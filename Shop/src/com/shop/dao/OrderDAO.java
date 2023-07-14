package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {
	
	private static OrderDAO instance = new OrderDAO();
	
	public static OrderDAO getInstance () {
		return instance;
	}
	
	public int insertOrder (OrderVO vo) {
		
		int result =0;
		
		try {
			conn=getConnection();
			psmt =conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderid());
			psmt.setInt(2, vo.getOrderproduct());
			psmt.setInt(3, vo.getOrdercount());
			result =psmt.executeUpdate();
			
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public OrderVO selectOrder (int orderno) {
		return null;
	}
	
	public List<OrderVO> selectOrders (String orderid) {
		
		List<OrderVO> orders =new ArrayList<>();
		try {
			
			conn =getConnection();
			psmt =conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, orderid);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				OrderVO vo =new OrderVO();
				vo.setOrderno(rs.getInt(1));
				vo.setOrderid(rs.getString(2));
				vo.setOrderproduct(rs.getInt(3));
				vo.setOrdercount(rs.getInt(4));
				vo.setOrderdate(rs.getString(5).substring(0,16));
				vo.setName(rs.getString(6));
				vo.setProdname(rs.getString(7));
				
			
				orders.add(vo);
			}
			close();
		} catch (Exception e) {
			
		}
		return orders;
	}
	
	public int updateOrder (OrderVO vo) {
		return 0;
	}
	

		
	public int deleteOrder (OrderVO vo) {
		return 0;		
	}
	
}
