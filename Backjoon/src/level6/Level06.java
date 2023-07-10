package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 
public class Level06 {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st =br.readLine().toUpperCase();
		int arr[] = new int [26];
		
		for(int i=0;i<st.length();i++) {
			int num =st.charAt(i)-'A';
			arr[num]++;
		}
		int max=0;
		char st2='?';
		for(int j=0; j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
				st2= (char)(j+'A');
			}else if(arr[j]==max) {
				st2='?';
			}
		}
		System.out.println(st2);
	
}
}