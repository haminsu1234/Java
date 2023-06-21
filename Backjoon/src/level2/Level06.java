package level2;

import java.util.Scanner;

public class Level06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h,m,com;
		h =sc.nextInt();
		m =sc.nextInt();
		com = sc.nextInt();
		
		m +=com;
		
	    if (m>=60) {
	    	h=h+(m/60);
	    	if (h>=24) {
	    		h-=24;
	    	}
	    	m=m%60;
			System.out.println(h+" "+m);

		} else if(m<60) {
			System.out.println(h+" "+m);
			
		} 

	}
}
