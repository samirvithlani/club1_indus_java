package com.thread;

class Thread1 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName() + "  Thread Is running");
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName() + "  Thread Is running");
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		t1.start();

		Thread2 t2 = new Thread2();
		t2.start();

	}
}
