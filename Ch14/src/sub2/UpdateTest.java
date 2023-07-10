package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Update 실습하기
 * 
 * 수정해야할부분
 * 
 */
public class UpdateTest {

	public static void main(String[] args) {
		//db정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user ="root";
		String pass ="1234";
		try {
			//1단계 : JDBC 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 : DB연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			//3단계 : SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			//4단계 : SQL 실행
			String sql = "update `user1` set `hp` ='010-1234-1111', `age`=25 where `uid` ='j101'";
			stmt.executeUpdate(sql);
			
			//5단계 : 결과처리
			//6단계 : 연결해제
			stmt.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {

		}
		System.out.println("업데이트 완료...");
	}
	
}
