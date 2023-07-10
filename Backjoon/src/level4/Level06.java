package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level06 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int [n];
		int i,j;
		
		for (int k=0; k<n;k++) {
			arr[k]=k+1;
		}
		
		for (int k=0;k<m;k++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			i=Integer.parseInt(st2.nextToken());
			j=Integer.parseInt(st2.nextToken());
			int c1=0;
			c1=arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=c1;
		}
		
		for (int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
		br.close();
	}
}
