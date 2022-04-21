package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	static final int MAX_SIZE = 5;
	static Queue q = new LinkedList(); 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("help 입력 - 도움말 출력");
		
		while (true) {
			System.out.print("입력 >>> ");
			String input = scan.nextLine().trim();
			if ("".equals(input)) continue;
			
			if (input.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {
				System.out.println(" help - 도움말 ");
				System.out.println(" q or Q - 프로그램 종료 ");
				System.out.println(" history or HISTORY - 최근 입력어 "+MAX_SIZE+"개 출력");
			} else if (input.equalsIgnoreCase("history")) {
//				save(input);
				
				LinkedList list = (LinkedList) q;
				
				final int listSize = list.size();
				for (int i=0; i < listSize; i++)
					System.out.println((i+1)+". "+list.get(i));
			} else {
				save(input);
				System.out.println(input);
			}
							
		} // while
		
	} // main
	
	private static void save(String input) {
		if (!"".equals(input)) // if (input != null & input.equals("") 
			q.offer(input);
		
		if (q.size() > MAX_SIZE)
			q.poll();
	} // save()

} // class
