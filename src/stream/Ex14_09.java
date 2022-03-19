package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_09 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr)
			.parallel() // 여러 스레드로 병렬 처리 > 실행마다 처리순서 다름
			.forEachOrdered(System.out::println); // 순서대로
//			.forEach(System.out::println);
		System.out.println();
		
		boolean noEmptyStr = Stream.of(strArr)
			.noneMatch(s -> s.length()==3);
//		Optional<String> sWord = Stream.of(strArr)
//			.filter(s -> s.charAt(0)=='s').findFirst();
		Optional<String> sWord = Stream.of(strArr).parallel()
			.filter(s -> s.charAt(0)=='s').findAny();
		
		System.out.println("noEmptyStr : "+noEmptyStr);
		System.out.println("sWord : "+sWord.get());
		System.out.println();

		// Stream<String>을 Stream<Integer>로 변환, s -> s.length()
//		Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);
		
		// Stream<String>을 기본형 스트림인 IntStream으로 변환
		// 기본형 스트림의 경우 '성능 우위'
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		// 초기값이 존재하여 Optional 아닌 int 사용
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a + b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
		System.out.println("max : " + max.getAsInt());
		System.out.println("min : " + min.getAsInt());
	}

}
