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
		// �޼��� ���� > ���ٽ� > �Լ��� �������̽�(=�߻� �޼��尡 �� �ϳ��� �������̽�)
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
//		strStrmStrm // java.util.stream.ReferencePipeline$Head@eed1f14 : �ϳ��� '��Ʈ��'�� ���
		strStrm
//			.map(String::toLowerCase) // �ҹ��ڷ� ��ȯ
//			.distinct() // �ߺ� ����
//			.sorted() // ����
			.forEach(System.out::println);
		System.out.println();
		
		// �������� �� ���ڿ�
		String[] lineArr = {
				"Believe or not It is True",
				"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +" : �ϳ� �̻��� " "�� ���Խ�
				.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
				
	}

}
