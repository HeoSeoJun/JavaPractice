package lambda;

import java.util.function.Function;

public class Ex14_01 {

	public static void main(String[] args) {
//		Function<String, Integer> f = (s) -> Integer.parseInt(s); 	// ���ٽ�
//		Function<String, Integer> f = Integer::parseInt;			// �޼��� ����
		Function<String, Integer> f = (s) -> Integer.parseInt(s);	// �ٽ� ���ٽ�
		System.out.println(f.apply("100")+200);
	}

}
