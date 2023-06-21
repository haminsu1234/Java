package sub2;

import java.util.Set;

/**
 * 날짜 :2023/06/19
 * 이름 : 하민수
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(정보은닉,Encapsulation)
 * -캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성
 * -클래스의 속성은 반드시 private 선언을 통해 캡슐화
 * -private 속성의 초기화를 위해 생성자(Construcktor)정의
 * -은닉된 정보(캡슐화)의 안전한 사용을 위해서 Getter,Setter 사용
 *
 * 
 * 
 */
public class EncpsuleTest {

	public static void main(String[] args) {
		// car 객체 생성 초기화
		// private 일떄 초기화를위한 생성자
		
		Car sonata = new Car("소나타","흰색",10);
		
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테","검은색",10);
		avante.setName("남색");
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성 초기화
		
		Account kb = new Account("국민은행","97-97-97","김김김",5000);
		
		kb.deposit(40000);
		kb.withdraw(20000);
		kb.show();
		
		Account wr =new Account("우리은행","97-98-96","이이이",1000);
		
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
		
	}
	
}
