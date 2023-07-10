package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level04 {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		
		StringBuilder st1 = new StringBuilder(st);
		st1.reverse();
		
		if (st.toString().equals(st1.toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
			
}
}