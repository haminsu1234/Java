package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a ,b;
		int arr[] = new int [n];
		
		for (int i=0; i<n ; i++) {
			arr[i]=i+1;
		}
		
		for (int i=0; i<m ; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			a=Integer.parseInt(st2.nextToken())-1;
			b=Integer.parseInt(st2.nextToken())-1;
			for (int j=a; j<=b; j++, b--) {
				int temp = arr[j];
				arr[j]=arr[b];
				arr[b]=temp;
			}
			}
		
		
		for (int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
