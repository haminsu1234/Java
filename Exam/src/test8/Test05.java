package test8;
@FunctionalInterface
interface NumericLambda{
	boolean test(int n);
}

public class Test05 {
	
	public static void main(String[] args) {
		
		NumericLambda isEven = (n)-> n%2==0;
		
		if(isEven.test(2)) {
			System.out.println("2는짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3는짝수 아님");
		}
		
		
		NumericLambda isNonNeg =(n) -> n>0;
				
		if(isNonNeg.test(1)) {
			System.out.println("1은양수");
		}
		
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}
		
	}

	
	
}
