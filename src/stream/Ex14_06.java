package stream;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_06 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex2"), new File("Ex2.txt") };
		
		Stream<File> fileStream = Stream.of(fileArr);
		
//		Stream<String> filenameStream = fileStream.map(File::getName); 메서드 참조
		Stream<String> filenameStream = fileStream.map((f) -> f.getName()); // 람다식
		filenameStream.forEach(System.out::println); // 최종 연산으로 스트림 소멸
		System.out.println();
		
		fileStream = Stream.of(fileArr); // 스트림 재생성
		
		fileStream.map(File::getName) // Stream<File> -> Stream<String>
			.filter(s -> s.indexOf('.') != -1) // 확장자 있는 것
			.peek(s -> System.out.printf("filename : %s%n", s))
			.map(s -> s.substring(s.indexOf('.')+1)) // 확장자 추출
			.peek(s -> System.out.printf("extension : %s%n", s))
			.map(String::toUpperCase) // 대문자로 변환
			.distinct()
			.forEach(System.out::println);
	}
}
