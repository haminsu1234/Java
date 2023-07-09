package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	// synchronized 동기화선언
	// 동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행
	public synchronized void setNum() {
		this.num ++;
	}
	
}
