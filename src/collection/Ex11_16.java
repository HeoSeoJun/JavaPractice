package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("admin", "0000");
		map.put("user1", "1111");
		System.out.println(map);
		map.put("user1", "1234"); // ������ key�� ���� value ����� 
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("���̵� �Է�");
			System.out.print(">>> ");
			String id = scan.nextLine().trim();
			
			System.out.println("��й�ȣ �Է�");
			System.out.print(">>> ");
			String pw = scan.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("�������� �ʴ� ���̵�");
				continue;
			}
			
			if (!(map.get(id)).equals(pw)) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			} else {
				System.out.println("�α��� ����!");
				break;
			}
		}
		
	}
}
