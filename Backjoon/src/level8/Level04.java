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

		int n = Integer.parseInt(br.readLine());
		int x=2;
		int y=0;
		int a=1;
		
		for(int i=0; i<n;i++) {
			x=x+a;
			y=x*x;
			a=2*a;
		}

		System.out.println(y);
	
	}
}
