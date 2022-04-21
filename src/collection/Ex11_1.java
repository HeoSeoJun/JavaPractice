package collection;

import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
//		ArrayList에는 객체만 저장 가능
//		list1.add(5); autoboxing에 의해 기본형이 참조형으로 자동 변환
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) = "+list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		System.out.println("Index = "+ list1.indexOf(new Integer(1)));
//		list1.remove(1);
		list1.remove(new Integer(1));
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) = "+list1.retainAll(list2));
		print(list1, list2);
		
		for (int i=list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	} // main
	
	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}

}
