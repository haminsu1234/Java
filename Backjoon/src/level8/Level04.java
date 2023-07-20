package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Level04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//정사각형의 각 변의 중앙에 점을 하나 추가한다.
		//정사각형의 중심에 점을 하나 추가한다.
		//3회차부터 한변에 중복되는 점이 생기는데 중복되는점은 카운트 하지 않거나 생성하지 않는다;
		//0-4 -2*2/ 1-9 3*3 /2-25 5*5/ 3-81 9*9/4-289 17*17/ 5 1089 33*33
	    // arr[0] = x*x
		// arr[1] = (x+t)*(x+t)
		// arr[2] = (x+2t)
		
		int n = Integer.parseInt(br.readLine());
		int x=2;
		int y=0;
		int t=0;
		
		for (int i=0; i<n;i++) {
			t*=2;
			x+=t;
			y=(x*x);
			if(t==0) {
				t++;
			} // t=1 -? t+1?
			
			

		}
		
		System.out.println(y);

		
	}
}
