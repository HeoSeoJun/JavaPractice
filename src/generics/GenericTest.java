package generics;

import java.util.ArrayList;

class Tv0 {}
class Audio0 {}

public class GenericTest {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
//		list.add(new Audio());
	}

}
