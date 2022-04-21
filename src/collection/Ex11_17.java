package collection;

import java.util.*;
import java.util.Map.Entry;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("���ڹ�", 90); // map.put("���ڹ�", new Integer(90));���� Auto Boxing
		map.put("���ڹ�", 85);
		map.put("���ڹ�", 92);
		map.put("���ڹ�", 78);
		map.put("���ڹ�", 100);
		
		Set entrySet = map.entrySet();
		Iterator<Set<Entry<String, Integer>>> iter = entrySet.iterator();
		
		while (iter.hasNext()) {
			Map.Entry e = (Map.Entry) iter.next();
			System.out.println("�̸�: "+e.getKey()+", ����: "+e.getValue());
		}
		
		Set keySet = map.keySet();
		System.out.println("������ ��� : "+keySet);
		
		Collection<Integer> values = map.values();
		
		Iterator<Integer> it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			total += it.next();
		}
		System.out.println("����: "+total);
		System.out.println("���: "+(float)total/keySet.size());
		System.out.println("�ְ�����: "+Collections.max(values));
		System.out.println("��������: "+Collections.min(values));
		
	}

}
