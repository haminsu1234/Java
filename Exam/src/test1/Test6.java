package test1;

import java.util.Scanner;

/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 자바 연산자 연습문제
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x =scan.nextInt();
		
		System.out.print("y값입력 : ");
		int y =scan.nextInt();
		
		String reslut = x > y ? "x가 더 큽니다." : "y가 더 큽니다";
		
		System.out.println(reslut);
		
	}
	
	
	
}
