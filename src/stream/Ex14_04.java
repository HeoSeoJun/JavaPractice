package stream;

import java.util.stream.IntStream;

public class Ex14_04 {

	public static void main(String[] args) {
		// ��Ʈ���� �߰�����
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.filter(i -> i%2 ==0).forEach(System.out::print);
		System.out.println();
		
		intStream = IntStream.rangeClosed(1, 10);
		intStream.filter(i -> i%2!=0 && i%3!=0).forEach(System.out::print);
		
	}

}
