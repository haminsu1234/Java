package level3;

import java.util.Scanner;

public class Level03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,mul;
		n=sc.nextInt();
		
		for (int i=1 ; i<=9 ; i++) {
			mul=n*i;
			System.out.println(n+" "+"*"+" "+i+" "+"="+" "+mul);
		}	
	}	
}
