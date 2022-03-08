package thread;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) {
		Thread9_1 th1 = new Thread9_1();
		th1.start();
		
		System.out.println("isInterrupted() : "+th1.isInterrupted());
		String input = JOptionPane.showInputDialog("아무 값 입력");
		System.out.println("입력값 : "+ input);
		th1.interrupt(); // interrupt() 호출로 interrupted상태가 true
		System.out.println("isInterrupted() : "+th1.isInterrupted()); // true
		System.out.println("isInterrupted() : "+th1.isInterrupted()); // true
		// main스레드가 interrupted여부 확인
		// static메소드인 interrupted()를 호출하기 위해 Thread.
		System.out.println("Interrupted() : "+Thread.interrupted()); // false
		System.out.println();
	}

}

class Thread9_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x=0; x<2500000000L; x++); // 시간 지연
		}
		System.out.println("isInterrupted() : "+this.isInterrupted()); // true
		System.out.println("isInterrupted() : "+this.isInterrupted()); // true
		System.out.println("isInterrupted() : "+Thread.interrupted()); // true
		System.out.println("isInterrupted() : "+Thread.interrupted()); // false로 초기화
		
		System.out.println("카운트 종료");
	}
}
