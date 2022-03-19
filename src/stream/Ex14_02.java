package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_02 {

	public static void main(String[] args) {
		// ��Ʈ�� ����� - ����
//		IntStream intStream = new Random().ints(); // ���� ��Ʈ��
		IntStream intStream = new Random().ints(5, 10); // 5~9������ ���� ��Ʈ��
		intStream
			.limit(5)	// 5���� �ڸ���
			.forEach(System.out::println);
		System.out.println();
		
		// Ư�� ������ ����
		intStream = IntStream.range(1, 6);
		intStream.forEach(System.out::print);
		System.out.println();
		intStream = IntStream.rangeClosed(1, 6);
		intStream.forEach(System.out::print);
		
	}

}
