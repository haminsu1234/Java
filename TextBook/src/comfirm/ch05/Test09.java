package comfirm.ch05;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		boolean run = true;
		 
		 Scanner sc = new Scanner(System.in);
	
		 int stu = 0;
		 int arr[]=null;
		 int sum=0;
		 double avg =0;
		 int count=0;

		 int max =0;
		 loop:
		 while(run) {
		 System.out.println("-------------------------------------");
		 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		 System.out.println("-------------------------------------");
		 System.out.print("선택> ");
		 
		 int answer =Integer.parseInt(sc.nextLine());
		 
		 	if(answer==1) {
		 		System.out.print("학생수> ");
		 		stu=Integer.parseInt(sc.nextLine());
		 		arr=new int[stu];
		 		continue;
		 	} else if(answer ==2 ) {
		 		for(int i=0;i<arr.length;i++) {
		 			System.out.print("score["+i+"]>");
		 			arr[i]=Integer.parseInt(sc.nextLine());
		 		}
		 		continue;
		 	} else if(answer==3) {
		 		for(int i=0;i<arr.length;i++) {
		 			System.out.println("score["+i+"]>"+arr[i]);
		 		}
		 		continue;
		 	}else if(answer==4) {
		 		for(int i=1;i<arr.length;i++) {
		 			if(arr[i]>arr[i-1]) {
		 				max=arr[i];
		 			}
		 		}
		 		
		 		for(int i=0;i<arr.length;i++) {
		 			sum+=arr[i];
		 			count++;
		 		}
		 		avg=(double)sum/count;

		 		System.out.println("최고점수 : "+max);
		 		System.out.println("평군점수 : "+avg);
		 	}else {
		 		System.out.println("프로그램종료");
		 		break loop;
		 	}
		 }
}
}
