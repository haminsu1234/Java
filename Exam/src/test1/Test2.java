package test1;

import java.util.Scanner;

/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 내용 : java 예제 2
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = scan.nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		birth = scan.nextInt();
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d입니다", name, age);
		
		scan.close();
		
		
		
		
		
	}
}
