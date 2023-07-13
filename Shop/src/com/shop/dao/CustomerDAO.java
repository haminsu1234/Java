package com.shop.dao;

import java.sql.*;
import java.util.*;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO<retrun> extends DBHelper {
	
	
	private static CustomerDAO instance = new CustomerDAO();
	//싱글톤
	public static CustomerDAO getInstance () {
		return instance;
	}

	private CustomerDAO() {}
	//db연결
	
	
	//기본 CRUD 매서드
	
	public int insertCustomer(CustomerVO vo) {
		
		int result =0;
		try {
			conn=getConnection();
			psmt =conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			//1성공, 0 실패
			result =psmt.executeUpdate();
			
			close();
			
			
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("이미사용중인 아이디입니다");
			
		} catch (SQLException  e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	public CustomerVO selectCustomer(String custid) {
			
		CustomerVO vo = new CustomerVO();
		
		try {
			conn =getConnection();
			psmt =conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custid);
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				//vo = new CustomerVO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		return vo;
}
	public List<CustomerVO> selectCustomers(CustomerVO vo) {
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	public int deleteCustomer(CustomerVO vo) {
		return 0;
	}
	
		
	
}
