package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Level08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n =20;
		String sub =null;
		double score = 0;
		String grade = null;
		double totsc =0;
		int subtot =n;
		double score2= 0;
		
		for (int i=0; i<n ;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sub=st.nextToken();
			score = Double.parseDouble(st.nextToken());
			grade = st.nextToken();
			
			if(grade.equals("A+") ) {
				totsc+= 4.5*score;
				score2 +=score;
			} else if(grade.equals("A0")) {
				totsc+= 4.0*score;
				score2 +=score;
			}else if(grade.equals("B+")) {
				totsc+= 3.5*score;
				score2 +=score;
			}else if(grade.equals("B0")) {
				totsc+= 3.0*score;
				score2 +=score;
			}else if(grade.equals("C+")) {
				totsc+= 2.5*score;
				score2 +=score;
			}else if(grade.equals("C0")) {
				totsc+= 2.0*score;
				score2 +=score;
			}else if(grade.equals("D+")) {
				totsc+= 1.5*score;
				score2 +=score;
			}else if(grade.equals("D0")) {
				totsc+= 1.0*score;
				score2 +=score;
			}else if(grade.equals("F")) {
				totsc+= 0.0*score;
				score2 +=score;
			}else {
				subtot--;
			}

	
		}
		
		System.out.println(totsc/score2);
	}
	
}
