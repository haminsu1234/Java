package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Level01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String str =st.nextToken();		
		int n =Integer.parseInt(st.nextToken());
		
		int change =Integer.parseInt(str, n);
		
		System.out.println(change);


		
	}
}
