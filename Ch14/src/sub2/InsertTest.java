package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Insert 실습하기
 * 
 */
public class InsertTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 : JDBC 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 : DB접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 : SQL실행 객체 생성
			Statement stmt=conn.createStatement();
			
			//4단계 : SQL실행
			//String sql ="delete from `user1` where `uid` ='j101'";
			String sql ="INSERT INTO `user1` values('j101','김유신','010-1234-1001',23)";
			stmt.executeUpdate(sql);
			
			//5단계 : 결과처리 -SELECT문일경우
			
			//6단계 : 연결해제
			stmt.close();
			conn.close();
		} catch (Exception e) {

		}

		System.out.println("Insert 완료...");
	}
	
}
