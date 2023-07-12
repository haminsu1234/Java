package sub8;
/**
 * 날짜 :2023/06/22
 * 이름 : 하민수
 * 내용 : Java 추상클래스 실습하기
 *  
 * 추상클래스 (Abstrack Class)
 * 일반클래스를 정의하기 위한 기본틀을 제공하는 클래스
 * 추상클래스를 상속받아 자식클래스에서 미완성 매서드 (추상매서드)를 완성
 * 
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//추상클래스 객체 생성할수 없음
		//Car car =new Car("","","");
		
		Car sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDwon(20);
		sonata.show();
		Car bongo = new Truck("봉고","남색",0,0);
		bongo.speedUp(80);
		bongo.speedDwon(60);
		bongo.show();
	}
	
}
