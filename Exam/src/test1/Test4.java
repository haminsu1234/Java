package test1;

import java.util.Scanner;

/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 내용 : 자바 예제 4
 */
public class Test4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력  : ");
		int score = scan.nextInt();
		char grade = 0;
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		if (score>=90) {
			grade ='A';
		}else if (score>=80) {
			grade ='B';
		}else if (score>=70) {
			grade ='C';
		}else if (score>=60) {
			grade ='D';
		}else if (score>=500) {
			grade ='F';
		}
		
		System.out.printf("등급은 %c입니다",grade);
		
		
		
		
		
	}
}
