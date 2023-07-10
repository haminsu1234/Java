package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
		
		int n =30;
		int m =28;
		int arr[] = new int[n];
		int arr2[] = new int[m];
		
		
		for(int i=0;i<30;i++) {
			arr[i]=i+1;		
		}
		
		for (int i=0;i<28;i++) {
			arr2[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<30;i++) {
			for(int j=0;j<28;j++) {
				if(arr[i]==arr2[j]) {
					arr[i]=0;
				}
			}
		}
	
		for(int i=0;i<30;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
				
		}
	
	}
}