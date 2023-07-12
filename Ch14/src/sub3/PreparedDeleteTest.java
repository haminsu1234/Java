package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass ="1234";
		
		try {
			
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// db연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//sql 객체 생성
			String sql = "delete from `user2` where uid =?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			//sql 실행
			psmt.executeUpdate();
			//결과처리
			//연결종료
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("delete문실행");
		
	}
	
	
}
