package thread;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {
		String message = "아무 값이나 입력하세요.";
		String input = JOptionPane.showInputDialog(message);
		System.out.println("입력하신 값은 "+input+" 입니다.");
		
		for (int i=10; i>0; i--) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}

}
