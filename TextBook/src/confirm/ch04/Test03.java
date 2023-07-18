package confirm.ch04;

public class Test03 {

	public static void main(String[] args) {
		
		int x=0;
		for(int i=1; i<=100 ; i++) {
			if(i%3==0) {
				x+=i;
			}
		}
		
		System.out.println(x);
	}
	
}
