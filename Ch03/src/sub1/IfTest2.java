package sub1;
/**
 * 날자 : 2023/06/13
 * 이름 : 하민수
 * 내용 : Java 조건문 if 실습하기 p111~115 내가 변형한거
 */
import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
	// 점수에따른 등급출력
		System.out.print("점수입력 : ");
	Scanner scan = new Scanner (System.in); 
	int score = scan.nextInt();
	
	System.out.println("점수는 : " +score);
	
	if (score >=90) {
		System.out.println("등급 : A");
	} else if(score >=80) {
		System.out.println("등급 : B");
	} else if (score >=70) {
		System.out.println("등급 : C");
	} else {
		System.out.println("낙제");
	}
	
	
	
	}

}
