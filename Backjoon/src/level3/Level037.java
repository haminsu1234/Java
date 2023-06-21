package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Level037 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int t=Integer.parseInt(br.readLine());
	int a,b;
	int sum[] = new int[t]; 
	
		for(int i=0;i<t;i++) {

			StringTokenizer st =new StringTokenizer(br.readLine());
			sum[i]=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
		}
	
		for (int j=0;j<t;j++) {
			bw.write(sum[j]+"\n");
		}
	
	bw.flush();
	bw.close();
	br.close();
	}
}

