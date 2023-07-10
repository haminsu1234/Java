package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Level10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String text = "";
		
		while((text=br.readLine())!=null) {
			System.out.println(text);
		}
	
	}
}
