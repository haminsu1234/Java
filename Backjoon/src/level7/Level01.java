package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level01 {

	public static void main(String[] args) throws IOException {

	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine());	
	
	int n =Integer.parseInt(st.nextToken()); //행
	int m =Integer.parseInt(st.nextToken()); //열
	
	int arr[][] = new int[n][m];
	for (int i=0 ; i<arr.length ; i++) {
		st = new StringTokenizer(br.readLine());	
		for (int j=0 ; j<arr[i].length; j++) {
			arr[i][j]=Integer.parseInt(st.nextToken());
		}
	}
	
	int arr2[][] = new int[n][m];
	for (int i=0 ; i<arr2.length ; i++) {
		st = new StringTokenizer(br.readLine());	
		for (int j=0 ; j<arr2[i].length; j++) {
			arr2[i][j]=Integer.parseInt(st.nextToken());
		}
	}
	
	int sum[][] = new int [n][m];
	for (int i=0 ; i<sum.length ; i++) {	
		for (int j=0 ; j<sum[i].length; j++) {
			sum[i][j]=arr[i][j]+arr2[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}			

	}
	
}


