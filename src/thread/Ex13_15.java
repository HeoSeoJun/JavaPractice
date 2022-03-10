package thread;

import java.util.ArrayList;

class Customer2 implements Runnable {
	private Table2 table;
	private String food;
	
	public Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			try { Thread.sleep(100); } catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		} // while
	}
	
	
}

class Cook2 implements Runnable {
	private Table2 table;
	
	public Cook2(Table2 table) {
		this.table = table;
	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(10); } catch (InterruptedException e) {}
		} // while
	}
	
}

class Table2 {
	String[] dishNames = { "donut", "donut", "burger" }; // donut의 확률을 높인다.
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait(); // COOK스레드 waiting
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		dishes.add(dish);
		notify(); // 기다리는 CUST 스레드 깨우기
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while (dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try { 
					wait(); // CUST 스레드 waiting
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			while (true) {
				for (int i=0; i<dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // COOK 스레드 깨우기 
						return;
					}
				} // for문의 끝
				
				try {
					System.out.println(name + " is waiting.");
					wait(); // 원하는 음식이 없는 CUST스레드 waiting
					Thread.sleep(500);
				} catch (Exception e) {}
			} // while (true)
		} // synchronized
	}
	
	public int dishNum() { return dishNames.length; }
	
}

public class Ex13_15 {

	public static void main(String[] args) throws Exception {
		Table2 table = new Table2(); // 여러 스레드가 공유하는 객체
		
		new Thread(new Cook2(table), "COOK").start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		
		Thread.sleep(3*1000);
		System.exit(0);
	}

}
