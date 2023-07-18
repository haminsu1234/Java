package confirm.ch04;

import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		

		 
		 int balance = 0;
		 
		 Scanner sc = new Scanner(System.in);
		 loop :
		 while(true) {
		 System.out.println("-------------------------------------");
		 System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		 System.out.println("-------------------------------------");
		 System.out.print("선택> ");
		 
		 int answer =sc.nextInt();
		 
		 	if(answer==1) {
		 		System.out.print("예금액> ");
		 		balance +=sc.nextInt();
		 		continue;
		 	} else if(answer ==2 ) {
		 		System.out.print("출금액> ");
		 		balance-=sc.nextInt();
		 		continue;
		 	} else if(answer==3) {
		 		System.out.println("잔고> " + balance);
		 		continue;
		 	}else {
		 		System.out.println("프로그램종료");
		 		break loop;
		 	}
		 
		 
		/* int menuNum = sc.nextInt();
		 
		 switch(menuNum) {
		 case 1:
		 System.out.print("예금액> ");
		 balance += sc.nextInt();
		 break;
		 case 2:
		 System.out.print("출금액> ");
		 balance -= sc.nextInt();
		 break;
		 case 3:
			 System.out.println("잔고> "+balance);
			 break;
		 default :
			 System.out.println("프로그램 종료");
			 break loop;
		
		 }*/
		 
		 
	
	
		 }
	
	}
}