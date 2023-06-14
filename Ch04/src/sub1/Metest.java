package sub1;

public class Metest {
	public static void main(String[] args) {
		
		int[] arr;
		int[] arr2;
		int[] arr3;
		
		arr  = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr==arr2);
		System.out.println(arr2==arr3);
		
	
	}
}
