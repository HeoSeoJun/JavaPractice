package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_05 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
						new Student("���ڹ�", 3, 300),
						new Student("���ڹ�", 2, 100),
						new Student("���ڹ�", 3, 100),
						new Student("���ڹ�", 1, 200),
						new Student("���ڹ�", 2, 150),
						new Student("���ڹ�", 1, 100),
						new Student("ä�ڹ�", 3, 200)
				);
		
		studentStream.sorted(
//			Comparator.comparing(Student::getBan).reversed() // �ݺ� ����, �޼ҵ� ����
			Comparator.comparing((Student s) -> s.getBan()).reversed() // �ݺ� ����, ���ٽ�
			.thenComparing(Comparator.naturalOrder()).reversed() // �⺻ ����
			)
			.forEach(System.out::println);
	}

}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}

	String getName()	{ return name;}
	int getBan()		{ return ban;}
	int getTotalScore()	{ return totalScore;} 
	
	// ���� ���������� �⺻ ���ķ� �Ѵ�.
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
	
}
