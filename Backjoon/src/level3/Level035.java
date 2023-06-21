package level3;

import java.util.Scanner;

public class Level035 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		int type;
		n=sc.nextInt();

		type = n/4;
		
		for(int i=0; i<type; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}

