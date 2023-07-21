package comfirm.ch08;
/*
 *1.1
 *2.3
 *3.4
 *4.1234?
 *5.
 *6.
 *7.
 *8. a instance of C c
 *9.
 *10.
 *
 */
interface Remocon{
	public void powerOn();
}

public class Test05 implements Remocon{

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다");
	}
	
	public static void main(String[] args) {
		Remocon r =new Test05();
		r.powerOn();
	}
	
}