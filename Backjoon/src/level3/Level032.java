package level3;

import java.util.Scanner;

public class Level032 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b,num;
		
		num = sc.nextInt();

		int sum[]= new int[num]; // 배열 범위 정하는방법	
		for(int i=0; i<num;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			sum[i]=a+b;
		}
		for (int j=0; j<num;j++) {
			System.out.println(sum[j]);
		}
	}
}
