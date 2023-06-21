package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level02 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int num1=Integer.parseInt(st.nextToken());
		int num2=Integer.parseInt(st.nextToken());

	
		StringTokenizer st2 =new StringTokenizer(br.readLine());
		int arr[] = new int[num1];
		
		for (int i=0;i<num1;i++) {
			arr[i] =Integer.parseInt(st2.nextToken());
			if (arr[i]<num2) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
