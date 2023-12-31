package com.thread;

public class ThreadDemo3 extends Thread {

	@Override
	public void run() {

		System.out.println(" -- " +Thread.currentThread().getName()+ " is running...");
		if(Thread.currentThread().getName().equals("A")) {
		System.out.println(Thread.currentThread().getName() + "  is going to sleep...");
		
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "  is back from sleep...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {

		
		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();
		
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
	}
}
