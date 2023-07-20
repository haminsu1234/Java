package comfirm.ch07;
/*
 * 1.1 -> 다중상속화 대신 인터페이스
 * 2.2 -> 부모가 고정이고 자식이 변형하지안
 * 3.1
 * 4.4
 * 5.1
 * 6.
 * 
 * 
 * 
 *
 */
class Activity {
public void onCreate() {
 System.out.println("기본적인 실행 내용");
}
}
public class Test07 extends Activity {
 @Override
 	public void onCreate() {
	 super.onCreate();
	 System.out.println("추가적인 실행 내용");
 	}
}


