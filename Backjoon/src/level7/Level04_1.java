package level7;

import java.io.*;
import java.util.*;
public class Level04_1 {
    public static void main(String[] args) throws IOException {
     
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	
    	int area[][] = new int [100][100];
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i=0; i<n ; i++) {
    		
    		StringTokenizer st =new StringTokenizer(br.readLine());
    		
    		int x =Integer.parseInt(st.nextToken());
    		int y =Integer.parseInt(st.nextToken());
    		
    		for (int j=x; j<x+10;j++) {
    			for(int k=y;k<y+10;k++) {
    				area[j][k]+=1;
    			}
    		}
    	}
    	
    	int count=0;
    	
    	for (int i=0; i<100;i++) {
    		for(int j=0; j<100;j++) {
    			if(area[i][j]>=n) { //전부다 겹치는부분
    				count+=n-1;
    		}else if(area[i][j]>=2) {
    				count+=area[i][j]-1;
    		}
    	}
    	}	
    	int area2 = n*100-count;
    	
    	System.out.println(area2);
    	
    	
    
 }
}

