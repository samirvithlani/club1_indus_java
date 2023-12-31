package com.thread;

public class ThreadDemo4 extends Thread {

	@Override
	public void run() {

		System.out.println("is running.." + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadDemo4 t1 = new ThreadDemo4();
		t1.start();
		t1.setName("A");

		try {
			System.out.println("Is going to sleep " + Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		ThreadDemo4 t2 = new ThreadDemo4();
		t2.setName("B");
		t2.start();

	}
}
