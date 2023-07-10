package realtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starnum2 {
	 public static void main(String[] args) throws IOException {
	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int n = Integer.parseInt(br.readLine());
		 
		 for (int i = 1; i <= n; i++) {
			    
			    // 좌측 공백을 찍기위한 j for문
			    for(int j = n-1; j >= i; j--) {
			        System.out.print(" ");
			    }
			    
			    // 별을 찍기위한 j for문
			    for(int j=1; j <=i; j++) {
			        System.out.print("*");
			    }
			    
			    System.out.println("");
			}
	
		 
	 }
}