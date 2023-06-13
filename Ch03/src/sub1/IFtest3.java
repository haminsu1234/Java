package sub1;
/**
 * 날자 : 2023/06/13
 * 이름 : 하민수
 * 내용 : Java 조건문 if 실습하기 p116 랜덤 매서드 사용해서 주사위 굴리기
 */
public class IFtest3 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1;
	// Math.random = 0.0 ~1.0 까지 실수중 하나를 랜덤하게 반환함 앞을 정수형으로 고정하면
	// 0~1, n개까지의 숫자를 원하면 *n x부터 시작이면 끝에 x를더함
		
		if (num==1) {
			System.out.println("1번이 뜸");
		} else if (num==2) {
			System.out.println("2번이 뜸");

		}else if (num==3) {
			System.out.println("3번이 뜸");

		}else if (num==4) {
			System.out.println("4번이 뜸");

		}else if (num==5) {
			System.out.println("5번이 뜸");

		}else {
			System.out.println("6번이 뜸");

		}
			
		
	}
}
