package collection;

import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		set.add("abc");
		set.add("car");
		set.add("dance");
		set.add("elephant");
		set.add("flower");
		set.add("alien");
		set.add("Car");
		set.add("dzzz");
		set.add("elevator");
		set.add("bat");
		set.add("disc");
		set.add("dZZZ");
		set.add("fan");
		
		System.out.println("range search: from "+from +"to "+to);
		System.out.println("result: "+ set.subSet("b", "d")); // d 포함 안함
		System.out.println("result: "+ set.subSet("b", "e"));
	}

}
