package sub1;
/**
 * 날짜 :2023/06/19
 * 이름 : 하민수
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스와 객체
 * -클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 * -객체(Object)는 클래스의 실제 인스턴스(Instance), new 연산으로 생성
 * 
 * 
 * 
 *
 */



public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체(Object)생성
		Car sonata = new Car(); // 객체생성시 불러오는 클래스로 type 지정; sonata는 참조변수
		
		//객체초기화
		sonata.name="";
		sonata.color="";
		sonata.speed=0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 선언, 생성 과 초기화
		
		Car avante; //선언
		
		avante= new Car(); //생성
		avante.name = "아반테"; //초기화
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체생성, 초기화, 기능활용
		Account kb =new Account();
		
		kb.bank ="국민은행";
		kb.id="97-97-97";
		kb.name="김김김";
		kb.balance=10000;
		
		kb.depoist(40000);
		kb.withdraw(30000);
		kb.show();
		
		// Account 객체생성, 초기화, 기능활용
		Account wr =new Account();
		
		wr.bank="우리은행";
		wr.id="97-86-54";
		wr.name="이이이";
		wr.balance=5000;
		
		wr.depoist(30000);
		wr.withdraw(4000);
		wr.show();
		
		// 변수 -> 기본type, 참조변수로나뉨 
		// 변수값 -> stack 에쌓임
		
	} //main end
}
