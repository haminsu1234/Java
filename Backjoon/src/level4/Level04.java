package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Level04 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[9]; 
		
		for (int i=0; i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());			
		}
		
		int max=arr[0];
		int num =0;
		for (int i=0; i<9;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		
		for (int i=0; i<9;i++) {
			if(arr[i]==max) {
				num=i+1;
				break;
			}
		}
		
		System.out.println(max);
		System.out.print(num);
		
		br.close();
	
	}
}
