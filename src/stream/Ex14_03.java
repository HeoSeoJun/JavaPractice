package stream;

import java.util.stream.Stream;

public class Ex14_03 {

	public static void main(String[] args) {
//		iterate(T seed, UnaryOperator f) ���� ������
		Stream<Integer> intStream = Stream.iterate(1, n -> n+2);
		intStream
			.limit(10)
			.forEach(System.out::println);
		System.out.println();
		
//		generate(Supplier s) : �Է�x ���o
		Stream<Integer> oneStream = Stream.generate( ()->1 );
		oneStream
			.limit(10)
			.forEach(System.out::print);
		
	}

}
