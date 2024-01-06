package com.thread;

class Table {

	public void printTable(int no) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(no + " * " + i + " = " + no * i);
		}

	}

}

class Thread12 extends Thread {

	Table t; // instance...

	public Thread12(Table t) {

		this.t = t;

	}

	@Override
	public void run() {

		t.printTable(100);
	}
}

class Thread13 extends Thread {

	Table t;

	public Thread13(Table t) {

		this.t = t;
	}

	public void run() {

		t.printTable(50);
	}
}

public class ThreadDemo6 {

	public static void main(String[] args) {

		Table table = new Table();
		Thread12 t1 = new Thread12(table);
		Thread13 t2 = new Thread13(table);
		t1.start();
		t2.start();
	}
}
