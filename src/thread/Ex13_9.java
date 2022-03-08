package thread;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) {
		Thread9_1 th1 = new Thread9_1();
		th1.start();
		
		System.out.println("isInterrupted() : "+th1.isInterrupted());
		String input = JOptionPane.showInputDialog("�ƹ� �� �Է�");
		System.out.println("�Է°� : "+ input);
		th1.interrupt(); // interrupt() ȣ��� interrupted���°� true
		System.out.println("isInterrupted() : "+th1.isInterrupted()); // true
		System.out.println("isInterrupted() : "+th1.isInterrupted()); // true
		// main�����尡 interrupted���� Ȯ��
		// static�޼ҵ��� interrupted()�� ȣ���ϱ� ���� Thread.
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
			for (long x=0; x<2500000000L; x++); // �ð� ����
		}
		System.out.println("isInterrupted() : "+this.isInterrupted()); // true
		System.out.println("isInterrupted() : "+this.isInterrupted()); // true
		System.out.println("isInterrupted() : "+Thread.interrupted()); // true
		System.out.println("isInterrupted() : "+Thread.interrupted()); // false�� �ʱ�ȭ
		
		System.out.println("ī��Ʈ ����");
	}
}
