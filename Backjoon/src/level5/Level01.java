package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		
		
		String sy = br.readLine();
		int select = Integer.parseInt(br.readLine());
		
		char c1= sy.charAt(select-1);
		
		System.out.println(c1);
		
		
	}
	
}
