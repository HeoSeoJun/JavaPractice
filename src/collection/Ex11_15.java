package collection;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = {35,87,98,79,20,50,99,16,29,8};
		
		for (int i=0;i<score.length;i++) {
			set.add(score[i]);
		}
		
		System.out.println("50점 미만: "+set.headSet(new Integer(50)));
		System.out.println("50점 이상: "+set.tailSet(new Integer(50)));
	}

}
