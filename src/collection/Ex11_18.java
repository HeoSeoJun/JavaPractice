package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex11_18 {

	public static void main(String[] args) {
//		문자 카운팅
		String[] rawData = {"A","D","C","D","B","D","C","C","A","D","D","C","B","A"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i=0; i<rawData.length; i++) {
			if (map.containsKey(rawData[i])) {
				int value = map.get(rawData[i]);
				map.put(rawData[i], value + 1);
			} else {
				map.put(rawData[i], 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // map에는 iterator()같은 메서드가 없어 Set으로 변경
		
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		
		while (iter.hasNext()) {
			Entry<String, Integer> e = iter.next();
			System.out.print(e.getKey()+": ");
			for (int i=0;i<e.getValue();i++)
				System.out.print("*");
			System.out.println(" "+e.getValue());
		}
	}

}
