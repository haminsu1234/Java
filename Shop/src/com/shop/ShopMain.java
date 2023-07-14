package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

/**
 * 날짜 :2023/07/13
 * 이름 : 하민수
 * 예제 : CRUD 실습하기
 * 
 * CRUD
 * Create, Read , Update , Delete 의미
 * DB의 기본처리기능을 의미
 * Insert Select Update Delete 처리기능
 * 
 * DAO
 * DATA Access Object
 * DB CRUD 처리객체
 * 
 */

public class ShopMain {
	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다");
		System.out.println("-------------------");
	
		Scanner sc =new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO =ProductDAO.getInstance();
		
		CustomerVO loginedCustomer =null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료 :0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");

			}else {
				System.out.println("종료 :0, 로그아웃:1, 주문현황:2, 상품목록:3, 구매하기:4");

			}
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			
			if(answer ==0) {
				break; //프로그램종료
			}else if(answer ==1) {
				//로그인
				
				if(loginedCustomer ==null) {
					System.out.print("아이디 입력 : ");
					String custid =sc.next();
					
					loginedCustomer =CustomerDAO.getInstance().selectCustomer(custid);
					if(loginedCustomer!=null) {
						System.out.println(loginedCustomer.getName()+" 님 어서오세요");
						
					}else {
						System.out.println("일치하는 회원이 없습니다");
					}
				} else {
					loginedCustomer = null;
					System.out.println("로그아웃 되었습니다");
				}
						
			}else if (answer ==2) {
				
				if(loginedCustomer==null) {
					CustomerVO vo = new CustomerVO();
					
					System.out.print("아이디 입력 : ");
					vo.setCustid(sc.next());
					
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
	
					System.out.print("휴대폰 입력 :");
					vo.setHp(sc.next());
	
					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());
	
					int result =customerDAO.insertCustomer(vo);
					
					if(result > 0) {
						System.out.println("회원가입을 축하합니다");
					}else {
						System.out.println("회원가입에 실패했습니다 다시가입하세요");
					}
				}else {
					
					String orderid =loginedCustomer.getCustid();
					List<OrderVO> myOrders =orderDAO.selectOrders(orderid);
				
					for(OrderVO myorder : myOrders) {
						System.out.println(myorder);
					}				
				
				}
			}else if(answer ==3) {
				
				List<ProductVO> products =productDAO.selectProducts();
				
				System.out.println("----------상품목록조회----------");
				for(ProductVO product : products) {
					System.out.println(product);
				}
			}else if (answer ==4) { //로그인한 정보를 먼저 받아야하고 구매할려하는 상품명 또는 상품번호를 입력하고 선택했으면 order테이블 수량증가
									// 또는 order 테이블에 새로운 로그 추가
									//구매할상품이 없으면 종료로 빠져나와야함
									
				if(loginedCustomer==null) {
					System.out.println("로그인먼저 해주세요");
					continue;
				}
				
				
				
				System.out.print("주문 상품번호 입력 :");
				int prodno =sc.nextInt();
				
				System.out.print("주문수량입력 :");
				int prodcount =sc.nextInt();
				
				OrderVO	orderVO = new OrderVO();
				orderVO.setOrderproduct(prodno);
				orderVO.setOrdercount(prodcount);
				orderVO.setOrderid(loginedCustomer.getCustid());
				
				
				
				//주문자 아이디
				
				int result =orderDAO.insertOrder(orderVO);
				productDAO.updateProductStock(prodno,prodcount);
				
				if(result > 0) {
					System.out.println("상품 주문이 완료되었습니다");
				}else {
					System.out.println("주문실패");
				}
			}
			
		}
			
		
		
		
		System.out.println("안녕히 가세요~");
		sc.close();
	
	
	
	}//main종료

}
