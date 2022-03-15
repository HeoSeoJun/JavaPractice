package stream;

import java.util.Optional;

public class Ex14_08_0 {

	public static void main(String[] args) {
//		int[] arr = null;
		int[] arr = new int[0];
		System.out.println("arr.length : "+arr.length);
		
//		Optional<String> opt = null; 바람직x
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");
		System.out.println("opt : "+opt);
//		System.out.println("opt : "+opt.get()); No value
		
		String str = "";
		
//		try {
//			str = opt.get();	// 예외발생
//		} catch (Exception e) {
//			str = "";			// 예외발생 시 빈문자열("")로 초기화
//		}
		
//		str = opt.orElse("EMPTY");
//		str = opt.orElseGet(()->new String());
		str = opt.orElseGet(String::new); // 람다식 <-> 메서드 참조
		System.out.println("str : "+ str);
	}

}
