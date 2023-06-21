package sub3;

public class Car {

	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적변수) , public 선언이 일반적 ,직접참조할거기 때문 메모리에서 method area 영역에
	//저장
	public static int count;
	
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	//클래스 매서드 (정적 매서드) -> 정적 변수 참조 -> 일반변수는 참조 안됨
	public static int  getCount() {
		return count;
	}
	
	
	
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
	
}
