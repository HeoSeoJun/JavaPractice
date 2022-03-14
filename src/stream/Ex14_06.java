package stream;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_06 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex2"), new File("Ex2.txt") };
		
		Stream<File> fileStream = Stream.of(fileArr);
		
//		Stream<String> filenameStream = fileStream.map(File::getName); �޼��� ����
		Stream<String> filenameStream = fileStream.map((f) -> f.getName()); // ���ٽ�
		filenameStream.forEach(System.out::println); // ���� �������� ��Ʈ�� �Ҹ�
		System.out.println();
		
		fileStream = Stream.of(fileArr); // ��Ʈ�� �����
		
		fileStream.map(File::getName) // Stream<File> -> Stream<String>
			.filter(s -> s.indexOf('.') != -1) // Ȯ���� �ִ� ��
			.peek(s -> System.out.printf("filename : %s%n", s))
			.map(s -> s.substring(s.indexOf('.')+1)) // Ȯ���� ����
			.peek(s -> System.out.printf("extension : %s%n", s))
			.map(String::toUpperCase) // �빮�ڷ� ��ȯ
			.distinct()
			.forEach(System.out::println);
	}
}
