package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
		System.out.println("A: "+setA);
		setB.add("4"); setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8");
		System.out.println("B: "+setB);
		
//		setA.retainAll(setB); // 교집합
//		setA.addAll(setB); // 합집합
//		setA.removeAll(setB); // 차집합
//		System.out.println(setA);
		
		// 교집합
		Iterator iter = setA.iterator();
		while (iter.hasNext()) {
			Object tmp = iter.next();
			if (setB.contains(tmp))
				setKyo.add(tmp);
		}
		System.out.println("Kyo: "+setKyo);
		
		// 차집합
		iter = setA.iterator();
		while (iter.hasNext()) {
			Object tmp = iter.next();
			if ((setB.contains(tmp) == false))
				setCha.add(tmp);
		}
		System.out.println("Cha: "+setCha);
		
		// 합집합
		iter = setA.iterator();
		while(iter.hasNext())
			setHab.add(iter.next());

		iter = setB.iterator();
		while(iter.hasNext())
			setHab.add(iter.next());
		
		System.out.println("Hab: "+setHab);
		
	}

}
