package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Delete 실습하기
 * 수정해야할부분
 * 
 */
public class DeleteTest {
	public static void main(String[] args) {
	
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass ="1234";
		
		
		try {
			//1단계 : jdbc 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 : db연결
			Connection conn =DriverManager.getConnection(host,user,pass);
			//3단계 : sql객체 실행
			Statement stmt =conn.createStatement();
			
			//4단계 : sql실행
			String sql = "delete from `user1` where `uid`='j101'";
			stmt.executeUpdate(sql);
			//5단계 : 결과처리
			//6단계 : 연결해제
			
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
		}
		
		
		System.out.println("delete 완료");
		
		
	}
	
}
