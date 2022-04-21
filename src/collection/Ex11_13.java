package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
//		Set set = new TreeSet(new TestComp()); // 범위 검색, 정렬. 정렬 필요 없음
		Set set = new TreeSet(); // 범위 검색, 정렬. 정렬 필요 없음
//		set = new HashSet(); // 정렬 필요
		
//		for (int i=0; set.size()<6 ;i++) {
//			1. 난수
//			int tmp = (int)(Math.random()*45)+1;
//			set.add(tmp);
//			2. 생성 객체 -> ClassCastException 발생
//			sol1. Comparator의 구현 클래스로 '비교 기준' 제공 == TreeSet이 비교기준 가짐
//			sol2. Comparable의 구현 클래스의 객체를 add == 오브젝트가 비교기준 가짐
			
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
//		}
		System.out.println(set);
	}

}

class Test implements Comparable {

	@Override
	public int compareTo(Object o) {
		return 1;
	}
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}
