package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_2 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100) + 1; // 1~100 난수
		Consumer<Integer> c = i -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i%2 == 0; // 짝수 판별
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리 제거
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(c, p, list);
		ArrayList<Integer> newList = doSomething(f, list);
		System.out.println(newList);
				
	}

	static ArrayList<Integer> doSomething(Function<Integer, Integer> f, ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>(list.size());
		
		for (int i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}

	static void printEvenNum(Consumer<Integer> c, Predicate<Integer> p, ArrayList<Integer> list) {
		System.out.print("[");
		for (int i : list) {
			if (p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}

	static void makeRandomList(Supplier<Integer> s, ArrayList<Integer> list) {
		for (int i=0; i<10 ; i++) {
			list.add(s.get());
		}
	}

}
