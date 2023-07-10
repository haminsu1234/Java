package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String sy=br.readLine();
		
		sy=sy.trim();
		String arr[] =sy.split(" ");
		int cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]=="") {
				cnt+=0;
			} else {
				cnt+=1;
			}

		}
				
		System.out.println(cnt);
	}
	
}
