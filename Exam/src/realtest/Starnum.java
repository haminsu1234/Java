package realtest;

public class Starnum {

	 public static void main(String[] args) {
		int n=4; // 몇줄까지 별을 출력할건지 정하는 용도의 변수
		
		for (int i=0; i<n; i++) {
			
			for (int j=n-1;j>i;j-- ) { //빈별을 찍는 용도의 반복문
				System.out.print("☆");
			}
			for(int j=0 ; j<=2*i;j++) { // 실제적으로 별이 찍히는 반복문 별이 2개씩늘어나므로 j<=2*1+1
				System.out.print("★");
			}
			
			for (int j=n-1;j>i;j-- ) { //빈별 찍는 용도의 반복문
				System.out.print("☆");
			}
			

		System.out.print("\n");//개행처리
		}
		
	}
}

