package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class Ex12_2_2 {

	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<String, Student2>();
		map.put("���ڹ�", new Student2("���ڹ�", 1, 1, 100, 100, 100));
//		map.put("���ڹ�", new Student2("���ڹ�", 1, 2, 87, 80, 95));
//		map.put("���ڹ�", new Student2("���ڹ�", 2, 1, 68, 84, 96));
		
		// public Student2 get(Object key) {
		Student2 s = map.get("���ڹ�");
		
		System.out.println(s.name); // { key = value(, key = value) } ���·� ���
	} // main

}
