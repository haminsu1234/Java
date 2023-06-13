package sub3;

public class ForTest2 {
	
	public static void main(String[] args) {
		//1부터 10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i+"");
		}
			
		//1부터 10까지 합
		int sum=0;
		for (int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum+"");
		
		//1부터 10까지 홀수만 출력
		for (int i=1; i<=10; i++) {
			if (i%2!=0) {
				System.out.println(""+i);
			}
		}
		//1부터 10 까지 짝수의 합
		int sum2=0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) {
				sum2+=i;
			}
		}
		System.out.println(sum2+"");
		//별 5줄 찍기 하나씩증가
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		//역으로 5줄 찍기 하나씩 감소
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		//별로 5줄 피라미드
		//int blank =
		//for (int i=1; i<=5; i++)
		//	for (int )
		//별로 역삼각형
		
		//
		//
		//
		//
		//
		//
		//
		
	}
}
