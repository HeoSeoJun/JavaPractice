package lambda;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

public class Ex14_1 {
	
	static void execute(MyFunction f) { // 매개변수 타입 = 함수형 인터페이스
		f.run();
	}
	
	static MyFunction getMyFunction() { // 반환 타입 = 함수형 인터페이스
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");
	}

	public static void main(String[] args) {
		MyFunction f1 = new MyFunction() { // 익명클래스로 run() 구현
			@Override
			public void run() { // public 필수
				System.out.println("f1.run()");
			}
		};
		
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f2 = () -> System.out.println("f2.run()");
		
		MyFunction f3 = () -> System.out.println("f3.run()");
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f2);
		execute( () -> System.out.println("run()") );
		
	}

}
