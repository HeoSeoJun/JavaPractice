package thread;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		Thread7_1 th1 = new Thread7_1();
		th1.start();
		
		String message = "�ƹ� ���̳� �Է��ϼ���.";
		String input = JOptionPane.showInputDialog(message);
		System.out.println("�Է��Ͻ� ���� "+input+" �Դϴ�.");
		
		
	}

}

class Thread7_1 extends Thread {
	@Override
	public void run() {
		for (int i=10; i>0; i--) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}
