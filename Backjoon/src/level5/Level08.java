package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n1=Integer.parseInt(st.nextToken());
		int n2=Integer.parseInt(st.nextToken());
		
		int n3 = ((n1%10)*100)+((n1%100)/10)*10+(n1/100);
		int n4 = ((n2%10)*100)+((n2%100)/10)*10+(n2/100);
		
		if (n3>n4) {
			System.out.println(n3);
		}else {
			System.out.println(n4);
		}
	}
	
}
