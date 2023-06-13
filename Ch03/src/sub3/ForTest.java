package sub3;
/**
 * 날자 : 2023/06/13
 * 이름 : 하민수
 * 내용 : Java 반복문 for 실습하기
 */
public class ForTest {
	
	public static void main(String[] args) {
		// 변수지정할 떄 범위 잘볼것 지역변수인지 전역변수인지
		// debug 모드로 들어가서 debug as 하면 한줄씩 실행되는걸 볼수있음 디버깅할때 좋음
		// for(초기식;조건식;증감식) {}
		for(int i=1; i<=5; i++) {
			System.out.println("i : "+i);
		}
		// 1부터 10까지 합
		int sum=0;
		for (int k=0; k<=10; k++) {
			sum+=k;
		}
		System.out.println("sum :"+sum);
		// 1부터 10까지 짝수합
		int tot=0;
		for (int j=0; j<=10; j++) {
			if (j%2==0) {
				tot += j;
			}
		}
		System.out.println("tot : "+tot);
		// for 중첩
		for (int a=1; a<=3; a++ ) {
			System.out.println("a : "+a);
			
			for (int b=1; b<=5; b++) {
				System.out.println("b : "+b);
			
				for (int c=1; c<=7; c++)
					System.out.println("c : "+c);
			}
			
				
			
		}
		 //구구단
				int mul=0;
				for (int k=2; k<=9; k++) {
					System.out.println(k+"단");
					
						for(int j=1; j<=9; j++) {
							mul = k*j;
							System.out.printf("%d x %d =%d\n",k,j,mul);
					}
				
				}	
		
		
		// 별삼각형
		for(int start =1; start <=10 ; start++) {
			for(int end=1; end <=start ; end++) {
				System.out.print("★");
				
			}
			System.out.print("\n"); //개행
		}
		// 역삼각별 
		for(int start =10; start >= 1 ; start--) {
			for(int end=1; end <=start ; end++) {
				System.out.print("★");
				
			}
			System.out.print("\n"); //개행
		}
						
				
				
				
		
		
	}
	
	
	
}
