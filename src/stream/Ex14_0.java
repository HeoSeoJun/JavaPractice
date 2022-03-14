package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 스트림 생성
		intStream.forEach(System.out::print); // 최종연산, 스트림은 1회용
		System.out.println();
		
		intStream = list.stream(); // 새로운 스트림 생성
		intStream.forEach(System.out::print);
		
	}

}
