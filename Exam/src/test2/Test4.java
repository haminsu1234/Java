package test2;
/**
 * 날짜 :2023/06/14
 * 이름 : 하민수
 * 내용 : Java 배열 역순으로 정렬 연습문제
 */
public class Test4 {
	public static void main(String[] args) {
		int arr [] = {4,2,1,5,3};
		
		for (int i=0; i<4; i++) {
			
			for(int j= i+1; j<5; j++) {
				
				if (arr[i]>arr[j]) {
					int temp =arr[j];
					arr[j] = arr[i];
					arr[i]= temp;
				}
			}
		}
		
		//System.out.println(" "+arr[4]);
		for (int n : arr) {
			System.out.print(n+" ");
		}
	}

}
