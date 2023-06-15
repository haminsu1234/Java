package level1;

import java.util.Scanner;
public class Level05 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);		
		double A; // 입력받는 수가 정수라해도 정수형으로 지정해버리면 계산도 정수로 계산되어서 소수의 표현이 안됨
		double B; 		
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A/B); 
	}
}	