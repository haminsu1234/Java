package level3;

import java.util.Scanner;

public class Level034 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		long x;
		int n,a,b;
		int sum =0;
		int all =0;
		x=sc.nextInt();
		n=sc.nextInt();
		
		for(int i =0 ;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			sum=a*b;
			all+=sum;
			}
		if(all==x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
		}
		
	}

