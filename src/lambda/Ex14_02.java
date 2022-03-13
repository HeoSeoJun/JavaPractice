package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_02 {

	public static void main(String[] args) {
		// Supplier는 입력x, only 출력
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new; // 매개변수 필요한 생성자 정의로 불가
		
//		MyClass mc = s.get();
//		System.out.println(mc);
//		System.out.println(s.get());
		
		// 생성자 - 매개변수 추가 -> Supplier 불가
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		
		MyClass mc = f.apply(10);
		System.out.println(mc.iv);
		System.out.println();
		System.out.println(f.apply(100).iv);
		
	}

}

class MyClass {
	int iv;
	
	public MyClass(int iv) {
		this.iv = iv;
	}
}
