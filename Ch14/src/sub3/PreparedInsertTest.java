package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Insert 실습하기(prepared)
 * 
 */
public class PreparedInsertTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String name = "root";
		String pass = "1234";
		
		try {
			
			//1단계 jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			//2단계 db 연결
			Connection conn = DriverManager.getConnection(host,name,pass);
			
			//3단계 sql 실행객체생성
			String sql = "insert into `user2` values(?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,"j101");
			psmt.setString(2,"홍길동");
			psmt.setString(3,"010-1234-1001");
			psmt.setInt(4,23);
			
			//4단계 sql 실행
			psmt.executeUpdate();
			
			
			//5단계 결과처리
					
			//6단계 연결해제
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("insert완료");
		
	}

}
