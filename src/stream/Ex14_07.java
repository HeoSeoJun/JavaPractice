package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_07 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"abc", "GHI", "JKL"}
		);
		
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		// 메서드 참조 > 람다식 > 함수형 인터페이스(=추상 메서드가 단 하나인 인터페이스)
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
//		strStrmStrm // java.util.stream.ReferencePipeline$Head@eed1f14 : 하나의 '스트림'을 출력
		strStrm
//			.map(String::toLowerCase) // 소문자로 변환
//			.distinct() // 중복 제거
//			.sorted() // 정렬
			.forEach(System.out::println);
		System.out.println();
		
		// 문장으로 된 문자열
		String[] lineArr = {
				"Believe or not It is True",
				"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +" : 하나 이상의 " "의 정규식
				.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
				
	}

}
