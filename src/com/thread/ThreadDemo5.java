package com.thread;

public class ThreadDemo5 extends Thread
 {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + "  Thread is running..." + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		ThreadDemo5 t1 = new ThreadDemo5();
		ThreadDemo5 t2 = new ThreadDemo5();
		ThreadDemo5 t3 = new ThreadDemo5();

		t1.setName("RED");
		t2.setName("GREEN");
		t3.setName("YELLOW");
		
		
		t1.start();
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		
		
		

	}
}
