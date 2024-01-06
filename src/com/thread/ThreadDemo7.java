package com.thread;

class Table1 {

	public synchronized void printTable(int no) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(no + " * " + i + " = " + no * i);
		}

	}

}

class MyThread1 extends Thread {

	Table1 t1;

	public MyThread1(Table1 t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.printTable(100);
	}

}

class MyThread2 extends Thread {

	Table1 t1;

	public MyThread2(Table1 t1) {

		this.t1 = t1;
	}

	@Override
	public void run() {

		t1.printTable(50);
	}

}

public class ThreadDemo7 {

	public static void main(String[] args) {

		Table1 table1 = new Table1();
		MyThread1 t1 = new MyThread1(table1);
		MyThread2 t2 = new MyThread2(table1);
		t1.start();
		t2.start();

	}
}
