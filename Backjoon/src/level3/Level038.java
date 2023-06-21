package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Level038 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int t=Integer.parseInt(br.readLine());
	int sum[] = new int[t];
	int a = 0,b = 0;

		for(int i=0;i<t;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			sum[i]=a+b;
			bw.write("Case #"+(i+1)+": "+String.valueOf(a)+" + "+String.valueOf(b)+" = "+sum[i]+"\n");
		}
	
	bw.flush();
	bw.close();
	br.close();
	}
}
