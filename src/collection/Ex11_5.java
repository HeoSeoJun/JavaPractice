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
		
//		참조 변수를 Collection으로 변경 가능, '다형성'
//		위의 경우, 에러 발생
//		why? Collection 인터페이스에는 get() 메서드가 없음.
//		for (int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
		
	} // main

}
