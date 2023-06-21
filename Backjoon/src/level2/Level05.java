package level2;

import java.util.Scanner;

public class Level05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h,m;
		h = sc.nextInt();
		m = sc.nextInt();
		
		m-=45;
		
		if (m>=0) {
			System.out.println(h+" "+m);
		} else if(m<0 && h>0) {
			m+=60;
			h-=1;
			System.out.println(h+" "+m);	
		} else if(m<0 && h==0) {
			m+=60;
			h+=23;
			System.out.println(h+" "+m);
		}

		
	}
	
}
