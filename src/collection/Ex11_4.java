package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	static final int MAX_SIZE = 5;
	static Queue q = new LinkedList(); 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("help �Է� - ���� ���");
		
		while (true) {
			System.out.print("�Է� >>> ");
			String input = scan.nextLine().trim();
			if ("".equals(input)) continue;
			
			if (input.equalsIgnoreCase("q")) {
				System.out.println("���α׷� ����");
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {
				System.out.println(" help - ���� ");
				System.out.println(" q or Q - ���α׷� ���� ");
				System.out.println(" history or HISTORY - �ֱ� �Է¾� "+MAX_SIZE+"�� ���");
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
