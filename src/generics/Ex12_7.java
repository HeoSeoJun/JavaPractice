package generics;

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {}
}

@FunctionalInterface
interface Testable {
	void test();
//	void check(); // @FunctionalInterface는 단 하나의 추상 메서드만 가능
}

public class Ex12_7 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // @Deprecated 된 메서드
	}
}
