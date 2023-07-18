package tt;
import java.util.*;

public class Testtt {

	public static void main(String[] args) {
		
		// 집합 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		// 반복자(Iterator)를 이용한 데이터 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			// 다음 데이터가 있을때 까지 반복 실행
			System.out.println(iter.next());
		}
		
		// 반복문을 이용한 데이터 출력
		for(int num : set) {
			System.out.println("num : " + num);
		}
	}

}
