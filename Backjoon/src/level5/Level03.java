package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		String sy;
		int len;
		char a,b;
		
		for(int i=0; i<test;i++) {
			sy = br.readLine();
			len = sy.length();
			a=sy.charAt(0);
			b=sy.charAt(len-1);
			
			System.out.print(a);
			System.out.println(b);

		}
		
	}
	
}
