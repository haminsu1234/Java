package level8;

import java.io.*;
import java.util.*;

public class Level05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int count =1;
		int area =2;
		
		if(n==1) {
			System.out.println(1);
		}else {
			while(area<=n) {
				area =area + (count*6);
				count++;
			}
			System.out.println(count);
		}
		
	
	}
}
