package collection;

import java.util.*;
import java.util.Map.Entry;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90); // map.put("김자바", new Integer(90));으로 Auto Boxing
		map.put("이자바", 85);
		map.put("최자바", 92);
		map.put("박자바", 78);
		map.put("김자바", 100);
		
		Set entrySet = map.entrySet();
		Iterator<Set<Entry<String, Integer>>> iter = entrySet.iterator();
		
		while (iter.hasNext()) {
			Map.Entry e = (Map.Entry) iter.next();
			System.out.println("이름: "+e.getKey()+", 점수: "+e.getValue());
		}
		
		Set keySet = map.keySet();
		System.out.println("참가자 명단 : "+keySet);
		
		Collection<Integer> values = map.values();
		
		Iterator<Integer> it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			total += it.next();
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+(float)total/keySet.size());
		System.out.println("최고점수: "+Collections.max(values));
		System.out.println("최저점수: "+Collections.min(values));
		
	}

}
