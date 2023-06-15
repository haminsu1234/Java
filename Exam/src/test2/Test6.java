package test2;

import java.util.Scanner;

/**
 * 날짜 :2023/06/14
 * 이름 : 하민수
 * 내용 : Java 배열 배열 이진 탐색 연습문제
 */
public class Test6 {

	public static void intro() {
		System.out.println("***** START *****");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input(Scanner sc, String name) {
		System.out.print("변수" + name+"값입력 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈결과 : "+val);
		System.out.println("***** end *****");		
	}
	
	public static int add(int x , int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a =input(sc,"a");
		int b =input(sc,"b");
		
		int output = add(a,b);
		result(output);
		
		
		
	}
	
}
