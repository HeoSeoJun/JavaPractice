package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_01 {

	public static void main(String[] args) {
//		�迭�� ��Ʈ�� �����
		
//		Stream<String> strStream = Stream.of("a","b","c");
		String[] strArr = new String[] {"a","b","c"}; 
//		Stream<String> strStream = Stream.of(new String[] {"a","b","c"});
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		System.out.println();
		
//		�⺻�� ��Ʈ�� for �������
//		int[] intArr = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
		
//		Stream<>���� ��ȯ�� �⺻���� ���������� ��ȯ�ؾ� ��
		Integer[] intArr = {1,2,3,4,5};
		Stream<Integer> intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
		System.out.println("count : " + intStream.count());
	}

}
