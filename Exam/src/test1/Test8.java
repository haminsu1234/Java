package test1;
/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 예제8
 */
public class Test8 {
 public static void main(String[] args) {
	int n=5; // n= 첫줄
	
	for (int i=0; i<n; i++) {
		
		for (int j=n-1;j>i;j-- ) { //공백 찍는용도 , 뒤는 공백이아니라 안찍힘 
			System.out.print("☆");
		}
		for(int j=0 ; j<=2*i;j++) { //별이 2개씩늘어나므로 2*i 답은 j<=2*1+1이라함..
			System.out.print("★");
		}
		
		for (int j=n-1;j<i;j-- ) { //공백 찍는용도 , 뒤는 공백이아니라 안찍힘 
			System.out.print("☆");
		}

	System.out.print("\n");
	}
	
}
}
