package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자 1 은 2초걸림 다음숫자부터는 1초씩 증가 
public class Level09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String ch = br.readLine();
		String[] arr= new String[ch.length()];
		
		int time =0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.substring(i,i+1);
		}// 배열에 입력문자 담김
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j].equals("A")||arr[j].equals("B")||arr[j].equals("C")) {
				time+=3;
			}else if(arr[j].equals("D")||arr[j].equals("E")||arr[j].equals("F")) {
				time+=4;
			}else if(arr[j].equals("G")||arr[j].equals("H")||arr[j].equals("I")) {
				time+=5;
			}else if(arr[j].equals("J")||arr[j].equals("K")||arr[j].equals("L")) {
				time+=6;
			}else if(arr[j].equals("M")||arr[j].equals("N")||arr[j].equals("O")) {
				time+=7;
			}else if(arr[j].equals("P")||arr[j].equals("Q")||arr[j].equals("R")||arr[j].equals("S")) {
				time+=8;
			}else if(arr[j].equals("T")||arr[j].equals("U")||arr[j].equals("V")) {
				time+=9;
			}else if(arr[j].equals("W")||arr[j].equals("X")||arr[j].equals("Y")||arr[j].equals("Z")) {
				time+=10;
			}else {
				time+=0;
			}
		}
		System.out.print(time);

	}
	
}
