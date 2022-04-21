package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("admin", "0000");
		map.put("user1", "1111");
		System.out.println(map);
		map.put("user1", "1234"); // 동일한 key에 대해 value 덮어쓰기 
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디 입력");
			System.out.print(">>> ");
			String id = scan.nextLine().trim();
			
			System.out.println("비밀번호 입력");
			System.out.print(">>> ");
			String pw = scan.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("존재하지 않는 아이디");
				continue;
			}
			
			if (!(map.get(id)).equals(pw)) {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
			} else {
				System.out.println("로그인 성공!");
				break;
			}
		}
		
	}
}
