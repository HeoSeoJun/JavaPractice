package lambda;

import java.util.function.Function;

public class Ex14_01 {

	public static void main(String[] args) {
//		Function<String, Integer> f = (s) -> Integer.parseInt(s); 	// 람다식
//		Function<String, Integer> f = Integer::parseInt;			// 메서드 참조
		Function<String, Integer> f = (s) -> Integer.parseInt(s);	// 다시 람다식
		System.out.println(f.apply("100")+200);
	}

}
