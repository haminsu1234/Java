package sub3;
/**
 * 날짜 :2023/07/03
 * 이름 : 하민수
 * 내용 : Java Thread 활용 실습하기
 *
 */
public class ThreadaddTest {

	public static void main(String[] args) throws InterruptedException {
		
		// runnable 인터페이스 구현 클래스
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		//runnable 구현클래스를 Thread 객체로 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		//스레드 실행
		t1.start();
		t2.start();
		
		//스레드 대기 (다른 스레드 종료를 대기)
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		
		// t1,t2 가 각각 다른 객체를 참조하기때문에 동기화 안해줘도댐 
		int total = tot1+tot2;
		System.out.println("total : "+total);
		
		
	}
	
}
