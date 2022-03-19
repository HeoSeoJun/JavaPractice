package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_02 {

	public static void main(String[] args) {
		// 스트림 만들기 - 난수
//		IntStream intStream = new Random().ints(); // 무한 스트림
		IntStream intStream = new Random().ints(5, 10); // 5~9까지의 무한 스트림
		intStream
			.limit(5)	// 5개만 자르기
			.forEach(System.out::println);
		System.out.println();
		
		// 특정 범위의 정수
		intStream = IntStream.range(1, 6);
		intStream.forEach(System.out::print);
		System.out.println();
		intStream = IntStream.rangeClosed(1, 6);
		intStream.forEach(System.out::print);
		
	}

}
