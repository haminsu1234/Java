package com.shop.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper{
private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance () {
		return instance;
	}
	
	public int insertProduct (ProductVO vo) {
		return 0;
	}
	public ProductVO selectProduct (int prodno) {
		ProductVO vo =null;
		try {
			conn=getConnection();
			psmt=conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodno);
			rs = psmt.executeQuery();
			
				
			if (rs.next()) {
				vo = new ProductVO();
				vo.setProdno(rs.getInt(1));
				vo.setProdname(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return vo;
	}
	public List<ProductVO> selectProducts () {
		
		List<ProductVO> prodcuts =new ArrayList<>();
		
		try {
			conn=getConnection();
			psmt=conn.prepareStatement(SQL.SELECT_PRODCUTS);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProdno(rs.getInt(1));
				vo.setProdname(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
	
				prodcuts.add(vo);
			}
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prodcuts;
	}
	public int updateProduct (ProductVO vo) {
		return 0;
	}
	
	public void updateProductStock(int prodno, int prodcount) {
		
		try {
			conn=getConnection();
			psmt =conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, prodcount);
			psmt.setInt(2, prodno);
			
			psmt.executeUpdate();
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	public int deleteProduct (ProductVO vo) {
		return 0;
		
	}

}
