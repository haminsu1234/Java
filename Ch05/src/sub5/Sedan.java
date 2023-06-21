package sub5;

public class Sedan extends Car {

	private int cc;
	
	public Sedan(String name, String color, int speed,int cc) {
		super(name, color, speed);
		this.cc=cc;
	}
	
	public void speedTurbo() {
		//private 에서 protected 로 변환해야 자식클래스에서 참조가능
		this.speed += 20;
	}

	public void show() {
		super.show();
		System.out.println("배기량 : "+this.cc);
	}
	
	
}
