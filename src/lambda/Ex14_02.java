package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_02 {

	public static void main(String[] args) {
		// Supplier�� �Է�x, only ���
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new; // �Ű����� �ʿ��� ������ ���Ƿ� �Ұ�
		
//		MyClass mc = s.get();
//		System.out.println(mc);
//		System.out.println(s.get());
		
		// ������ - �Ű����� �߰� -> Supplier �Ұ�
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
