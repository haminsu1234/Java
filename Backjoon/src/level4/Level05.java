package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level05 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n =Integer.parseInt(st.nextToken()); //바구니갯수
		int m =Integer.parseInt(st.nextToken());// 줄수
		
		int start;
		int end;
		int k;
		
		int arr[] = new int[n];
		
		for (int a=0; a<m;a++) {
			StringTokenizer st2= new StringTokenizer(br.readLine());
			start = Integer.parseInt(st2.nextToken());
			end = Integer.parseInt(st2.nextToken());
			k =Integer.parseInt(st2.nextToken());
			}
			
		
		
		
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
