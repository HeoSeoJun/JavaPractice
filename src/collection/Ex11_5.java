package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ex11_5 {

	public static void main(String[] args) {
		Collection list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
		
//		���� ������ Collection���� ���� ����, '������'
//		���� ���, ���� �߻�
//		why? Collection �������̽����� get() �޼��尡 ����.
//		for (int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
		
	} // main

}
