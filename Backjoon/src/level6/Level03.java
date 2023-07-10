package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level03 {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		
			int n=Integer.parseInt(br.readLine());
			int count = 0;
			for (int i=1; i<=n*2-1; i++) {
				if(i<=n) {
					count+=1; //마름모의 윗부분 (정삼각형부분) count++
				}else {
					count-=1; // 마름모의 아랫부분 (역삼각형부분) count--
				}
				
			for (int j=1 ; j<=n-count ; j++) {
				System.out.print(" ");
			}
			for (int k=1 ; k<=2*count-1 ; k++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
			
			}
				
}
}