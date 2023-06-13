package test1;
/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 예제8
 */
public class Test8 {
 public static void main(String[] args) {
	int n=5;
	
	for (int i=0; i<n; i++) {
		
		for (int j=n-1;j>=n-i;j-- ) {
			System.out.print(" ");
		}
		for(int j=0 ; j<=(i*2-1);j++) {
			System.out.print("★");
		}

	System.out.print("\n");
	}
	
}
}
