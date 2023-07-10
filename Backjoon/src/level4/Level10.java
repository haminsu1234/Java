package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int  a = Integer.parseInt(br.readLine());
		double arr[] = new double[a];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<a;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			}
		
		double max=0;
		for (int i=0;i<a;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}

		double sum=0;

		for (int i=0;i<a;i++) {
			sum+=(arr[i]/max)*100;
			
		}
	System.out.println(sum/a);
	}
}
