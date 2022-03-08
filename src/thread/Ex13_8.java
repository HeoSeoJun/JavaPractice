package thread;

public class Ex13_8 {

	public static void main(String[] args) {
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		th1.start();
		th2.start();
		
		delay(2*1000);
		System.out.println("<<main 종료>>");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}

class Thread8_1 extends Thread {
	@Override
	public void run() {
		for (int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	}
}

class Thread8_2 extends Thread {
	@Override
	public void run() {
		for (int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	}
}