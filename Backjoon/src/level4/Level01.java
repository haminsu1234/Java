package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int arr[]= new int [num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b =Integer.parseInt(br.readLine());
		int num2 =0;
		
		for(int i=0;i<num ; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]==b) {
				num2+=1;
			}
		}

		System.out.println(num2);

		
		bw.flush();
		br.close();
		bw.close();
	}

}
