package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
//		Set set = new TreeSet(new TestComp()); // ���� �˻�, ����. ���� �ʿ� ����
		Set set = new TreeSet(); // ���� �˻�, ����. ���� �ʿ� ����
//		set = new HashSet(); // ���� �ʿ�
		
//		for (int i=0; set.size()<6 ;i++) {
//			1. ����
//			int tmp = (int)(Math.random()*45)+1;
//			set.add(tmp);
//			2. ���� ��ü -> ClassCastException �߻�
//			sol1. Comparator�� ���� Ŭ������ '�� ����' ���� == TreeSet�� �񱳱��� ����
//			sol2. Comparable�� ���� Ŭ������ ��ü�� add == ������Ʈ�� �񱳱��� ����
			
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
