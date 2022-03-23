package generics;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }

class Toy { public String toString() { return "Toy"; }}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

class FruitBox<T extends Fruit> extends Box<T> {}
//class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

public class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		Box<Toy> toyBox = new Box<Toy>(); // OK
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy()); // 컴파일 에러, 상속으로 제한된 지네릭
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		toyBox.add(new Toy());
		
		System.out.println("fruitBox : "+fruitBox);
		System.out.println("appleBox : "+appleBox);
		System.out.println("grapeBox : "+grapeBox);
		System.out.println("toyBox : "+toyBox);
		
	}

}
