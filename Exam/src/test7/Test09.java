package test7;

abstract class Tv{
	public void turnOn() {
		
	}
	public void turnOff() {
		
	}
}//interface를 써야하는이유가 추상클래스는 클래스간의 명확(의미있는)연관관계가 있을때 써야하는데 여기서는 바로 메인함수에서 선언하기때문에 추상클래스보다는 인터페이스를 쓰는건가 싶다



public class Test09  {

	public static void main(String[] args) {
	
		Tv tv = new Tv() {
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다");
				}
		};
		
		tv.turnOn();
		tv.turnOff();
		
		
		}
	}


	
	
	
	

