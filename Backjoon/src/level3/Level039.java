package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Level039 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n=Integer.parseInt(br.readLine());


		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=0;j--) {
				if(i>j) {
				bw.write("*");
				}else {
				bw.write(" ");	
				}
			}
			bw.write("\n");
		}
	
	bw.flush();
	bw.close();
	br.close();
	}
}
