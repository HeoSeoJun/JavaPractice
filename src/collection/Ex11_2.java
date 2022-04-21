package collection;

import java.util.*;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
//		st.add("0");
//		st.add("1");
//		st.add("2");
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("== Stack ==");
		while (!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("== Queue ==");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
