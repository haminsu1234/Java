package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Insert 실습하기(update)
 * 
 */


public class PreparedUpdateTest {

	public static void main(String[] args) {
	
		String host = "jdbc:mysql://localhost:3306/userdb";
		String name = "root";
		String pass ="1234";
		
		try {
			//jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// db연결
			Connection conn = DriverManager.getConnection(host,name,pass);
			// sql 실행객체 생성
			String sql = "Update `user2` set hp=?, age=? where uid =?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,"010-1234-1111");
			pstm.setInt(2, 25);
			pstm.setString(3, "j101");
			//sql 실행
			pstm.executeUpdate();
			//결과처리
			//연결종료
			pstm.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("update 실행...");
		
	}

}
