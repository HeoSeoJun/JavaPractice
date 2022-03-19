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
		map.put("김자바", new Student2("김자바", 1, 1, 100, 100, 100));
//		map.put("나자바", new Student2("나자바", 1, 2, 87, 80, 95));
//		map.put("박자바", new Student2("박자바", 2, 1, 68, 84, 96));
		
		// public Student2 get(Object key) {
		Student2 s = map.get("김자바");
		
		System.out.println(s.name); // { key = value(, key = value) } 형태로 출력
	} // main

}
