package test4;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		String strCsv ="60,72,82,86,92";
		String [] score = strCsv.split(",");
		
		int total =0;
		
		for(int i=0 ; i<score.length;i++) {
			total +=Integer.valueOf(score[i]);//integer.parseint 로 해야함...
		}
		System.out.println("총점 :" +total);
	}
}
