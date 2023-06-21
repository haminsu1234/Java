package level3;

import java.util.Scanner;

public class Level033 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		for (int i=1; i<=n ; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
