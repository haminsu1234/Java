package sub2;
/**
 * 날짜 :2023/06/14
 * 이름 : 하민수
 * 내용 : Java 매서드 실습하기
 */

public class MethodTest {
	
	//전역변수 : 객체가 해체 될때 해제
	int num =1;

	//진입 시작점 매서드 -> class 라는 구조체안에 진입시작점 매서드가 존재
	//main method :프로그램 진입점
	public static void main(String[] args) {
		
		// 매서드 호출
		int y1 =f(1);
		
		int y2 =f(2);
		
		int y3 =f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		//매서드 지역변수와 스택
		int t1 = sum(1,10);
		int t2 = sum(1,100);
		
		
		System.out.println("t1 :" +t1);
		System.out.println("t2 :" +t2);
		
		
	}
	// 매서드 정의 -> 원래는 static이 없음 -> 객체를 배우면 알게됨  -> main 에서 호출해야해서
	// void -> 반환타입 ->
	// return 되는 변수의 자료형을 선언 
	// int x -> 매개변수
	public static int  f(int x) {
		int y = 2 * x +3;
		return y;
	}
	//매서드 정의
	// 스택 -> 메모리
	public static int  sum(int start, int end) {
		//지역변수 -> 어떤 블럭 안에서 생성된 변수 그안에서만 적용됨 
		// 지역변수 -> 매서드가 종료되면 스택에서 해제 
		int total =0;
		
		for (int k=start; k<=end ; k++) {
			total +=k;
		}
		return total;
		
	}
		
}
