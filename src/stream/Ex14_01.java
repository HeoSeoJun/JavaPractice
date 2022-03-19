package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_01 {

	public static void main(String[] args) {
//		배열로 스트림 만들기
		
//		Stream<String> strStream = Stream.of("a","b","c");
		String[] strArr = new String[] {"a","b","c"}; 
//		Stream<String> strStream = Stream.of(new String[] {"a","b","c"});
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		System.out.println();
		
//		기본형 스트림 for 성능향상
//		int[] intArr = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
		
//		Stream<>으로 변환시 기본형을 참조형으로 변환해야 함
		Integer[] intArr = {1,2,3,4,5};
		Stream<Integer> intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
		System.out.println("count : " + intStream.count());
	}

}
