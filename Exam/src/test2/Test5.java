package test2;

import java.util.Scanner;

/**
 * 날짜 :2023/06/14
 * 이름 : 하민수
 * 내용 : Java 배열 배열 이진 탐색 연습문제
 */
public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int arr[]= {5,10,18,22,35,55,75,103,152};
		
		System.out.println("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start =0;
		int end =arr.length -1;
		int loc =0;
		boolean state =false;
		
		while (start <= end) {
			int mid = (start +end)/2;
			
			if (arr[mid] > value) {
				end = mid +1;
			} else if (arr[mid] < value) {
				start = mid -1;
			}else {
				loc =mid;
				state =true;
				break;
			}
		}
		
		if (state) {
			System.out.printf("찾은 위치 : %d번쨰 있습니다",loc+1);
		} else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();
	}
	
}
