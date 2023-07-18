package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level02 {
	 public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int arr [][]= new int[9][9];
		 
		 for (int i=0 ; i<arr.length;i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int j=0; j<arr.length;j++) {
				 arr[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }
		 
		 int max =0;
		 
		 for (int i=0; i<arr.length;i++) {
			 for(int j=0; j<arr.length;j++) {
				 if(arr[i][j]>=max) {
					 max=arr[i][j];
				 }
			 }
		 }
		 System.out.println(max);
		 
		 loop:
		 for (int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 if(arr[i][j]==max) {
					 System.out.println((i+1)+" "+(j+1));
					 break loop;
				 }
			 }
		 }
		 
		 
		 
	}
}
