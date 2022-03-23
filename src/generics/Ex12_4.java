package generics;

import java.util.ArrayList;

class Fruit2 { public String toString() { return "Fruits2"; } }
class Apple2 extends Fruit2 { public String toString() { return "Apple2"; } }
class Grape2 extends Fruit2 { public String toString() { return "Grape2"; } }

class Juice {
	String name;
	
	public Juice(String name) { this.name = name + "juice"; }
	public String toString() { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		
		for (Fruit2 f : box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Ex12_4 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main

}
