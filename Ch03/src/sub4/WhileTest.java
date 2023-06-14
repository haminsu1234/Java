package sub4;
/**
 * 날자 : 2023/06/14
 * 이름 : 하민수
 * 내용 : Java 반복문 while 실습하기
 */


public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k =1;
		
		// while (조건식) { 
		while (k<=10) {
			sum+=k;
			k++;
		}
		System.out.println("1부터 10까지의 합 : " +sum);

		// do~while 최소 한번은 실행함 
		int tot = 0;
		int i =1;
	
		do {
		
		if(i%2==0) {
			tot+=i;
		}
			i++;
		}while(i<=10);
		
		System.out.println("1부터 10까지의 짝수합 : "+ tot);
		
		// break
		int num = 1;
		
		while (true) { //무한루프
			
			if (num%5==0 && num %7==0) {
				break;    // 해당 문장을 종료시킴
			}
		num++;
		}
		
		System.out.println("5와7의 최소공배수 : " + num);
		
		
		// continue
		
		int total = 0;
		int j = 0;
		
		while(j <= 10) {
			j++;
			
			if(j%2==1) {
				continue; // 나머지가 1이면 처음으로 돌아감 (반복문 상위로 올라감)
			}
			total += j;
			
		}
		System.out.println("1부터10까지 짝수합 : "+total);
	
		
	
	
	
	
	
	}
}
