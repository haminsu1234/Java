package comfirm.ch05;

public class Test07 {

	public static void main(String[] args) {

		int array[] = {1,5,3,8,2};
		int max=0;
		for(int i=1;i<array.length;i++) {
			
			if(array[i]>array[i-1]) {
				max=array[i];
			}else {
				max=array[i-1];
			}
			
			
		}
		
		System.out.println("배열의 최대값 : "+max);
		
	}
	
}
