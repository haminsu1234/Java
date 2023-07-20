package comfirm.ch07;
/*
 * 1.1 -> 다중상속화 대신 인터페이스
 * 2.2 -> 부모가 고정이고 자식이 변형하지안
 * 3.1
 * 4.4
 * 5.2
 * 6.this.name -> super(name)
 * 7. 34 12
 * 8. 스노우 타이어가 굴러갑니다 *2
 * 9.2
 * 10. 추상클래스인데 상속받는 자식클래스에서 매서드가 정의되지 않아서
 * 11.super.
 * 12. a instance of c -> 형변환 까지 해야함 -> a instance of C c
 * 
 * 
 * 
 *
 */
public class Test06 {
	public String name;
	public Test06(String name) {
		this.name = name;
	}
}

class Child extends Test06 {
	public int studentNo;
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
