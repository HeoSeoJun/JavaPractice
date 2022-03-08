package thread;

public class Ex13_10_2 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2*1000);
			th1.suspend();
			Thread.sleep(2*1000);
			th2.suspend();
			Thread.sleep(3*1000);
			th1.resume();
			Thread.sleep(3*1000);
			th1.stop();
			th2.stop();
			Thread.sleep(2*1000);
			th3.stop();
		} catch (InterruptedException e) {}
	} // main

}

class MyThread implements Runnable {
	volatile boolean suspended = false; // 쉽게 바뀌는 변수
	volatile boolean stopped = false;
	// volatile : 자주 바뀌는 변수니 '캐시메모리'에 있는 복사본이 아닌 '주메모리'에 있는 원본 사용.
	
	Thread th;
	
	MyThread(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	void start() {th.start();}
	void stop() {stopped = true;}
	void suspend() {suspended = true;}
	void resume() {stopped = false;}
	
	@Override
	public void run() {
		while (!stopped) {
			if (!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	} // run
}
