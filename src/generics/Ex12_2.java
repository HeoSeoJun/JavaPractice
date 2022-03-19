package generics;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	String name;
	int ban;
	int no;
	
	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}

public class Ex12_2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("���ڹ�", 1, 1));
		list.add(new Student("���ڹ�", 2, 1));
		list.add(new Student("���ڹ�", 1, 3));
		
		Iterator<Student> iter = list.iterator();
//		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
//			Student s = (Student) iter.next(); // ���׸����� ������� ������ '����ȯ' �ʿ�
			System.out.println(s.name);
			System.out.println(s.ban);
			System.out.println(s.no);
			System.out.println();
		}
	}

}
