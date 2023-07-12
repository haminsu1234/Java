package sub8;

public abstract class Car {
	
	protected String name;
	protected String color;
	protected int speed;
		
	public Car(String name, String color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
		

	public abstract void speedUp(int speed);
	
	public abstract void speedDwon(int speed);
		
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("차량속도 : "+this.speed);
	}
		
		
}

	

