package level1;

import java.util.Scanner;

/**
 * 
 * 곱셈 과정 다구하기
 *
 */
public class Level10 {
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);

	}
}
