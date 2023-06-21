package sub3;
/**
 * 날짜 :2023/06/20
 * 이름 : 하민수
 * 내용 : 클래스 변수, 클래스 매서드 실습하기
 * 
 * 클래스 변수 , 클래스 매서드(정적변수, 정적매서드)
 * -static 을 선언한 변수, 매서드로 Method Area에 생성
 * -별도의 객체생성(new)를 하지않고 클래스타입으로 참조
 * -객체(인스턴스)들 간의 공유 ) 목적으로 클래스 변수, 클래스 매서드 사용
 * 
 * 싱글톤 객체(Singleton)
 * -static 을 활용한 싱글톤객체는 오직 하나의 인스턴스로 메모리상에 존제
 * 싱글톤객체를 사용해서 메모리 절약과 성능향상을 기대 
 * 
 * 
 */

class Increment{
	private int num1;
	public  static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}


public class StaticTest {

	public static void main(String[] args) {
		
		//Increment 실습
		Increment inc1= new Increment();
		Increment inc2= new Increment();
		Increment inc3= new Increment();
		

		
		// 다른 패키지면 import선언

		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반테","검정",20);
		Car grande = new Car("그랜저","남색",30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		
		//클래스 변수 참조
		System.out.println("전체 차량 수 : "+Car.count);
		//클래스 매서드 호출
		System.out.println("현재 차량수 : "+Car.getCount());
		
		//싱글톤 객체 실습// 메모리에 오직하나로 생성됨
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int reslut = c1.plus(1, 2);
		int reslut2 = c1.minus(1, 2);
	
		System.out.println("reslut1 : "+reslut);
		System.out.println("reslut2 : "+reslut2);
	}
	
}
