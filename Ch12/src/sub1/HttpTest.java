package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 날짜 :2023/07/06
 * 이름 : 하민수
 * 예제 : Java http 통신 실습하기
 */
public class HttpTest {

	public static void main(String[] args) {
		
		FileOutputStream fos =null; //파일에 기록하기위한 stream
		BufferedReader br = null; 
		
		try {
			URL url = new URL("https://google.com");
			
			try {
				br = new BufferedReader(new InputStreamReader(url.openStream()));
				fos = new FileOutputStream("./Result.txt");
				
				String line = null;
				
				while((line = br.readLine())!=null) {
					
					System.out.println(line);
					fos.write(line.getBytes());
					
				}
				br.close();
				fos.close();
				
			} catch (IOException e) {				
				e.printStackTrace();
			}			
		} catch (MalformedURLException e) { //잘못된 url일경우
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
				
	}
	
}