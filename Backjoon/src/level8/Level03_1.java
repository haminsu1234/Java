package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Level03_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//quarter 0.25 , dime 0.10 nickel 0.05 penny 0.01
		int t = Integer.parseInt(br.readLine());
		int c=0;
		int quarter=0;
		int dime=0;
		int nickel=0;
		int penny=0;
		
		for(int i=0; i<t ; i++) {
			c=Integer.parseInt(br.readLine());
		
			quarter=c/25;
			dime=(c-quarter*25)/10;
			nickel = (c-quarter*25-dime*10)/5;
			penny = (c-quarter*25-dime*10-nickel*5)/1;
		
			System.out.printf("%d %d %d %d\n",quarter,dime,nickel,penny);	
		}
	

		
	}
}
