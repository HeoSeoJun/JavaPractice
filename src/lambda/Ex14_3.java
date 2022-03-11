package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g); // g.andThen(f);
		
		System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2)); // 2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x; // 항등 함수(identiti function)
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p = i -> i<100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i>=100
		
		Predicate<Integer> all = notP.and(q.or(r));
		// i>=100 && (i<200 || i%2 == 0) >> 
		System.out.println(all.test(150)); // T && (T || T) 'true'
		
		String str1 = "abc";
		String str2 = "abc"; // "abc" != new String("abc"); why? 서로 다른 주소
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
//		boolean result2 = str1.equals(str1);
		System.out.println(result);
//		System.out.println(result2);				
				
		
		
	}

}
