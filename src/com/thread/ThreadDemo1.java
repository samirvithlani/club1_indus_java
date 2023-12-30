package com.thread;

public class ThreadDemo1 extends Thread {

	@Override
	public void run() {

		for(int i=1;i<=5;i++) {
			System.out.println(i+" - "+Thread.currentThread().getName() + " Thread is running...");
		}
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();

		t1.setName("A");
		t2.setName("B");

		// to start a new threa...
		t1.start();
		t2.start();
		

	}
}
