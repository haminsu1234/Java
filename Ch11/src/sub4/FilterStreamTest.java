package sub4;

import java.util.Arrays;
import java.util.List;

/**
 * 날짜 :2023/07/04
 * 이름 : 하민수
 * 내용 : Java 필터스트림 실습하기
 *
 *
 */
public class FilterStreamTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		//중복제거
		numbers
			.stream()
			.distinct()
			.forEach(num -> System.out.print(num + ", "));
		
		System.out.println();
		// 5이상 데이터 필터링
		numbers
			.stream()
			.filter(num->num>=5)
			.forEach(num -> System.out.print(num+", "));
		
		// 중복 제거 짝수 데이터
		System.out.println();
		numbers
			.stream()
			.distinct()
			.filter(num -> num%2==0)
			.forEach(num -> System.out.print(num+","));
	}
}
