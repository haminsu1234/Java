package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		
		int len = st.length();
		
		System.out.println(len);
		
	}
	
}
