package collection;

import java.util.*;
import static java.util.Collections.*;


public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);
		System.out.println(list);
		
		swap(list, 0, 3);
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int index = binarySearch(list, 3);
		System.out.println("index of 3: "+index);
		
		System.out.println("max: "+max(list));
		System.out.println("min: "+min(list));
		System.out.println("min: "+max(list, reverseOrder()));
		
		fill(list, 9);
		System.out.println(list);
		
		List listNew = nCopies(list.size(), 2);
		System.out.println("listNew: "+listNew);
		
		System.out.println(disjoint(list, listNew));
		
		copy(list, listNew);
		System.out.println("list: "+list);
		System.out.println("listNew: "+listNew);
		
		replaceAll(list, 2, 1);
		System.out.println(list);
		
		Enumeration e =enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2: "+list2);
		
	}

}
