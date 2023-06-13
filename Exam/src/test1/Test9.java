package test1;
/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 예제 9
 */
public class Test9 {
public static void main(String[] args) {
	
	int count = 0;
	for (int i=1; i<=9; i++) {
		if(i<=5) {
			count+=1;
		}else {
			count-=1;
		}
		
	for (int j=1 ; j<=5-count ; j++) {
		System.out.print(" ");
	}
	for (int k=1 ; k<=2*count-1 ; k++) {
		System.out.print("*");
		
	}
	System.out.print("\n");
	
	}
		
}
}
