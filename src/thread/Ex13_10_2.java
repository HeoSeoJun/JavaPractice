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
	volatile boolean suspended = false; // ���� �ٲ�� ����
	volatile boolean stopped = false;
	// volatile : ���� �ٲ�� ������ 'ĳ�ø޸�'�� �ִ� ���纻�� �ƴ� '�ָ޸�'�� �ִ� ���� ���.
	
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
