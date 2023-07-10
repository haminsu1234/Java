package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Level05 {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		
		st= st.replace("lj"," ");
		st= st.replace("c="," ");
		st= st.replace("c-"," ");
		st= st.replace("dz="," ");
		st= st.replace("d-"," ");
		st= st.replace("nj"," ");
		st= st.replace("s="," ");
		st= st.replace("z="," ");
		
		
		System.out.println(st.length());
	
}
}