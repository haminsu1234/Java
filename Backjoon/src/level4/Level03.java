package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level03 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int max=arr[0];
		int min=arr[0];
		
		for (int i=0;i<n;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			} else if (arr[i]<min) {
				min=arr[i];
			} 
		}

		System.out.print(min+" "+max);
		
		
		br.close();

	}

}
