package lambda;

import java.util.function.Function;

public class Ex14_03 {

	public static void main(String[] args) {
//		Function<Integer, int[]> f = (i) -> new int[i];
		Function<Integer, int[]> f = int[]::new;
		int[] arr = f.apply(10);
		System.out.println("배열 길이 : " + arr.length);
	}

}
