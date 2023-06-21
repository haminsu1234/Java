package sub6;

public class Car {
	
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String Color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	

	public void speedUp(int speed) {
		this.speed+=speed;
	}
	
	public void speedDwon(int speed) {
		this.speed-= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("차량속도 : "+this.speed);
	}
	
	
}
