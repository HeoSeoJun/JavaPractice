package lambda;

public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a,b) -> a>b?a:b; // ���ٽ�, �͸�ü
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) { // �������̵� ��Ģ - ���������� ��� �Ұ�
//				return a>b? a:b;
//			}
//		};
		
		MyFunction2 f = (a,b) -> a>b? a : b; // ���ٽ�, �͸� ��ü
		
		int result = f.max(3,5); // Object Ŭ���� �� max()�� ���� x, �׷��� '�Լ��� �������̽�' �ʿ�
		System.out.println("result = "+result);
	}
}

@FunctionalInterface // �� �ϳ��� �߻� �޼��常 ����
interface MyFunction2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
}