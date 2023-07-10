package test3;
/**
 * 날짜 :2023/06/23
 * 이름 : 하민수
 * 내용 : Java 클래스 상속 연습문제
 */

class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent{
	public void getMoeny(){
		System.out.println("건물주입니다.");
		super.payment();
	}
}


public class Level06 {
	public static void main(String[] args) {
		Landload master =new Landload();
		master.getMoeny();
	}

}
