package test3;
/**
 * 날짜 :2023/06/23
 * 이름 : 하민수
 * 내용 : Java 다형성
 */

abstract class Shape{
	public abstract void draw();
}


class Triangle extends Shape{
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Level09 {

	public static void main(String[] args) {
		
		Level09 here =new Level09();
		
		Shape circle =new Circle();
		Shape triangle =new Triangle();
		
		here.draw(circle);
		here.draw(triangle);

	}
	public void draw(Shape obj) {
		obj.draw();
	}
	
}
