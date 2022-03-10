package lambda;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

public class Ex14_1 {
	
	static void execute(MyFunction f) { // �Ű����� Ÿ�� = �Լ��� �������̽�
		f.run();
	}
	
	static MyFunction getMyFunction() { // ��ȯ Ÿ�� = �Լ��� �������̽�
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");
	}

	public static void main(String[] args) {
		MyFunction f1 = new MyFunction() { // �͸�Ŭ������ run() ����
			@Override
			public void run() { // public �ʼ�
				System.out.println("f1.run()");
			}
		};
		
		// ���ٽ����� MyFunction�� run()�� ����
		MyFunction f2 = () -> System.out.println("f2.run()");
		
		MyFunction f3 = () -> System.out.println("f3.run()");
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f2);
		execute( () -> System.out.println("run()") );
		
	}

}
