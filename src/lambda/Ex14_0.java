package lambda;

public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a,b) -> a>b?a:b; // 람다식, 익명객체
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) { // 오버라이딩 규칙 - 접근제어자 축소 불가
//				return a>b? a:b;
//			}
//		};
		
		MyFunction2 f = (a,b) -> a>b? a : b; // 람다식, 익명 객체
		
		int result = f.max(3,5); // Object 클래스 내 max()가 존재 x, 그래서 '함수형 인터페이스' 필요
		System.out.println("result = "+result);
	}
}

@FunctionalInterface // 단 하나의 추상 메서드만 가능
interface MyFunction2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
}