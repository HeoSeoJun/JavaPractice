package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_11 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("ellie", 20));
		set.add(new Person("ellie", 20));
		// ���� ������ �� ��ü�� '���� �޸� �ּҰ� �޶�' �ߺ��� �ƴ� 
		
		System.out.println(set);
	}

}

// equals()�� hashCode()�� �������̵� �ؾ� HashSet�� �ߺ��� �ν�
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}