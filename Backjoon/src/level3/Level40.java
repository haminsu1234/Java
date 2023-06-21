package level3;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Level40 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		
		int a =0;
		int b =0;
		
		while (true) {
			String str	= br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			if (a==0&&b==0) {
				break;
			} else {
			 bw.write(a+b+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

		
	}
	
}
