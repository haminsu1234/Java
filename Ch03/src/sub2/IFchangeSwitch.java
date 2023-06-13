package sub2;

import java.util.Scanner;

public class IFchangeSwitch {
	
	public static void main(String[] args) {
		
		System.out.print("점수 입력 : ");
		Scanner scan = new Scanner (System.in);
		int score = scan.nextInt();
		
		switch(score) {
			case 90 :
			System.out.println("A");
			break;
			
			case 80 :
				System.out.println("B");
				break;
			case 70 :
				System.out.println("C");
				break;
			case 60 :
				System.out.println("낙제");
				break;

			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
