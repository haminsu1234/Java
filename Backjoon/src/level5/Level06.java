package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Level06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int num;
		String text;
		for(int i =0 ; i<test ; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			num=Integer.parseInt(st.nextToken());
			text = st.nextToken();
			for(int j=0; j<text.length(); j++) {
				for(int k=0; k<num;k++) {
				System.out.print(text.charAt(j));
				}
			}
			System.out.println();
		}

	}
	
}
