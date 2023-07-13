package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
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
		return null;
	}
	public List<ProductVO> selectProducts (ProductVO vo) {
		return null;
	}
	public int updateProduct (ProductVO vo) {
		return 0;
	}
		
	public int deleteProduct (ProductVO vo) {
		return 0;
		
	}

}
