package sub1;

import java.util.Scanner;

public class P157 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String numbers;
		
		System.out.print("주민번호 입력 : ");
		numbers = sc.next();
		
		char star = numbers.charAt(6);
		
		switch(star) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
				
	}	
	
}
