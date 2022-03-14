package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // list�� ������ �ҽ��� �ϴ� ���ο� ��Ʈ�� ����
		intStream.forEach(System.out::print); // ��������, ��Ʈ���� 1ȸ��
		System.out.println();
		
		intStream = list.stream(); // ���ο� ��Ʈ�� ����
		intStream.forEach(System.out::print);
		
	}

}
