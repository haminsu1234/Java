package sub1;
/**
 * 날자 : 2023/06/13
 * 이름 : 하민수
 * 내용 : Java 조건문 if 실습하기
 */
public class Iftest {
	public static void main(String[] args) {
		
		//if = if (조건식) {} : 조건식의 조건이 참일때 중괄호안의 내용을 실행 거짓이면 if문을 빠져나옴
		int num1 = 1;
		int num2 = 2;
		
		if (num1 < num2) {
			
			System.out.println("num1은 num2보다 작다");
			
		}
		
		if (num1 > 1) {
			
			System.out.println("num1은 1보다 크다");
			
		}
		
		if(num1 >0) {
			
			if (num2 >1) {
				System.out.println("num1은 0보다크고 num2는 1보다 크다");
			}
		}
		
		if (num1 >0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		
		//if ~else
		int var1 =1, var2 =2;
		
		if (var1 < var2 ) {
			// 조건이 참일때 실행
			System.out.println("var1이 var2보다크다");
		}else {
			//조건이 거짓일때 실행
			System.out.println("var1이 var2보다작다");
		}
		
		
		//if ~ else if ~ esle

		int n1= 1, n2=2, n3=3, n4=4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다");
		} else if(n2 >n3) {
			System.out.println("n2이 n3보다 크다");
		} else if(n3> n4) {
			System.out.println("n3이 n4보다 크다");
		} else {
			System.out.println("n4가 가장크다 크다");
		}
	}	
}
