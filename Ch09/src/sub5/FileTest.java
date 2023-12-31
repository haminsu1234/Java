package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 :2023/06/30
 * 이름 : 하민수
 * 내용 : Java File 클래스 실습하기
 * 
 * 파일클래스
 * -File 클래스는 파일에 대한 경로나 정보를 조회할때 사용하는 클래스
 * -별도의 입출력기능이 없어 스트림을 통한 데이터 입출력 
 * 
 */


public class FileTest {

	public static void main(String[] args) {
		//파일 객체 생성
		File f1 =new File("C:\\Users\\Java\\Desktop\\file.txt");
		File f2 =new File("../../../../../file2");
		
		// 파일 /폴더 생성
		
		try {
			
			//폴더생성
			f2.mkdir();
			//파일생성
			f1.createNewFile();
			//파일구분 확인 // is,has -> boolean값 리턴 
			System.out.println("f1 isfile: "+f1.isFile());
			System.out.println("f1 isDirectory: "+f1.isDirectory());
			System.out.println("f2 isFile: "+f2.isFile());
			System.out.println("f2 isDirectory: "+f2.isDirectory());
			System.out.println("f1 getName: "+f1.getName());
			System.out.println("f2 getName: "+f2.getName());
			System.out.println("f1 : getAbsolutePath"+f1.getAbsolutePath());
			System.out.println("f2 : getAbsolutePath"+f2.getAbsolutePath());
			System.out.println("f1 : getPath"+f1.getAbsolutePath());
			System.out.println("f2 : getPath"+f2.getAbsolutePath());
			
			//파일삭제
			f1.delete();
			f2.delete();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
		
	}
	
	
}
