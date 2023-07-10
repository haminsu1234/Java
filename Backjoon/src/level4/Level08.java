package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
		
		int n=10;
		int arr[] = new int [n];
		boolean check;
		int count=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine())%42;
		}
		
		for(int i=0;i<n;i++) {
			check = false;
			for(int k=i+1;k<n;k++) {
				if(arr[i]==arr[k]) {
					check=true;
					break;
				}
			}
		
			if(check!=true) {
				count+=1;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}