package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level02 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st= new StringTokenizer(br.readLine());
	int arr1[]=new int[6];
	int arr2[]= {1,1,2,2,2,8};
	int count[] =new int [6];
	
	for (int i=0;i<arr1.length;i++) {
		arr1[i]=Integer.parseInt(st.nextToken());		
	
	
		for(int j=0;j<arr1.length;j++) {
			if(arr2[j]-arr1[j]>=0) {
				count[j]=arr2[j]-arr1[j];
				
			}else if (arr2[j]-arr1[j]<0) {
				count[j]=arr2[j]-arr1[j];
			}
			
		}
		System.out.print(count[i]+" ");
	}
	}
}
