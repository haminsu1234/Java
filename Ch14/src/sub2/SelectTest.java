package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 날짜 :2023/07/10
 * 이름 : 하민수
 * 예제 : JDBC Select 실습하기
 * 수정해야할부분
 * 
 */
public class SelectTest {

	public static void main(String[] args) {
		
		//db정보
		String host ="jdbc:mysql://localhost:3306/userdb";
		String user ="root";
		String pass ="1234";
		
		
		try {
			//1단계 : jdbc 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 :db연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 : sql 객체생성
			Statement stmt = conn.createStatement();
			
			//4단계 :
			String sql = "select * from `user1`";
			ResultSet rs =stmt.executeQuery(sql);
			
			//5단계 : 결과처리 (select 경우)
			while(rs.next()) { // boolean 을 리턴하는데 다음 레코드가 존재하면 true 반환 
				
				String uid =rs.getString(1);
				String name =rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
			
				System.out.printf("%s,%s,%s,%d\n",uid,name,hp,age);
			}
			
			//6단계 : 연결종료
			rs.close();
			stmt.close();
			conn.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("select 실행완료...");
	}

}
