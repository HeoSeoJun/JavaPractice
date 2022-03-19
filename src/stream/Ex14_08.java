package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_08 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
//		Optional<Integer> optInt = optStr.map(String::length);
		Optional<Integer> optInt = optStr.map((s)->s.length());
		System.out.println("optStr : "+optStr.get());
		System.out.println("optInt : "+optInt.get());
		System.out.println();
		
		int result1 = Optional.of("123")
							.filter(x -> x.length() > 0)
//							.map(Integer::parseInt).get();
							.map(s -> Integer.parseInt(s)).get();
		
		int result2 = Optional.of("")
				.filter(x -> x.length() > 0)
				.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println();
		
		Optional.of("345")
			.map(Integer::parseInt)
			.ifPresent(s->System.out.printf("result3 : %d%n", s));
		System.out.println();
		
		OptionalInt optInt1 = OptionalInt.of(0);
		OptionalInt optInt2 = OptionalInt.empty();
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
		System.out.println();
		
		System.out.println(optInt1.getAsInt()); // 0
//		System.out.println(optInt2.getAsInt()); // No value
		System.out.println("optInt1 : "+optInt1);
		System.out.println("optInt2 : "+optInt2);
		System.out.println(optInt1.equals(optInt2)); // false
				
	}

}
