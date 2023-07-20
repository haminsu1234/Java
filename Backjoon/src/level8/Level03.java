package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Level03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//quarter 0.25 , dime 0.10 nickel 0.05 penny 0.01
		int t = Integer.parseInt(br.readLine());
		int c;
		int quarter=0;
		int dime=0;
		int nickel=0;
		int penny=0;
		
		for(int i=0; i<t;i++) {
			c=Integer.parseInt(br.readLine());
			
			if(c>=25) {
				quarter=c/25;
				if(c%25>=10) {
					dime= (c%25)/10;
					if((c%25)%10>=5) {
						nickel=((c%25)%10)/5;
					}else {
						penny=((c%25)%10)/1;
					}
				}else if(c%25>=5) {
					nickel=(c%25)/5;
					if((c%25)%5>=1) {
						penny=((c%25)%5)/1;
					}
				}else if(c%25>=1) {
					penny=(c%25)/1;
				}
				

			}else if(c>=10) {
				dime=c/10;
				if(c%10>=5) {
					nickel=(c%10)/5;
				
				}else {
					penny=(c%10)/1;

				}
			}else if(c>=5) {
				nickel=c/5;
				if(c%5>=1) {
					penny=(c%5)/1;

				}

			}else {
				penny=c/1;

			}
			System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
		}



		
	}
}
