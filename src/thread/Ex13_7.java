package thread;

public class Ex13_7 implements Runnable{
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7());
		t.setDaemon(true);
		t.start();
		
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println(i);
			
			if (i==5) autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000); // 3�ʸ���
			} catch (Exception e) {}
			
			// autoSave�� ���� true�̸� autoSave()�� ȣ��
			if (autoSave) autoSave();
		}
		
	}

	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}
	
}
