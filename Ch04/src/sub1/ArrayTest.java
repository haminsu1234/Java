package sub1;
/**
 * 날짜 :2023/06/13
 * 이름 : 하민수
 * 내용 : Java 배열 실습하기
 */


public class ArrayTest {
	public static void main(String[] args) {
		
		//배열 
		int[] arr1 = {1,2,3,4,5};
		
		char[] arr2 = {'A','B','C'};
		
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		//원소출력
		System.out.println("arr1[0] :" +arr1[0]);
		System.out.println("arr1[2] :" +arr1[2]);
		System.out.println("arr1[3] :" +arr1[3]);
		
		System.out.println("arr2[2] :" +arr2[2]);
		
		System.out.println("arr3[3] : " +arr3[3]);
	
		//배열길이 -> 원소 길이 
		System.out.println("arr1 길이 : "+arr1.length); // 참조연산자 ,배열길이 .length
		System.out.println("arr2 길이 : "+arr2.length); // 참조연산자 ,배열길이 .length
		System.out.println("arr3 길이 : "+arr3.length); // 참조연산자 ,배열길이 .length
		
		//배열반복문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");				
		}
		
		System.out.println();
		
		for(char c: arr2) {
			System.out.print(c+" ");					
			
		}
		
		System.out.println();
		
		for(String d: arr3) {
			System.out.print(d+" ");					
			
		}
		
		
		
		//1차원 배열
		int[] scores = {80,60,78,62,92}; //변수선언할때 복수형으로
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("socres 합 : " +total);
		
		//2차원 배열
		int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int a=0; a<3 ; a++) {
			
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : "+ arr2d[a][b]);
			}
			
		}
		
		//3차원배열
		
		int [][][] arr3d = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
							{{10,11,12},
							{13,14,15},
							{16,17,18}},
							{{19,20,21},
							{22,23,24},
							{25,26,27}}};
		
		System.out.printf("arr3d[%d][%d][%d] : %d\n", 0,0,0, arr3d[0][0][0]);		
		
		for(int a=0; a<3 ; a++) {
			
			for(int b =0; b<3; b++) {
				
				for(int c=0; c<3; c++) {
					System.out.printf("arr3[%d][%d][%d]",a,b,c, arr3d[a][b][c]);
					System.out.println(" ");
				}
			}
		}
		
		
	}
	
	
}
