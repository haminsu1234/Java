package sub1;


//클래스 정의 (Car 클래스 정의)
public class Car {	
	// 필드 (속성)
	String name;
	String color;
	int speed;
		
	// 매서드 (기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
	
	
	
	
	
	
	

}
//객체(in)