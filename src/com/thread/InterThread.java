package com.thread;

//Thread --> Thread ->
// KUSH VARAN --> ASWASTH
// AS --> KUSH --> VARANU WAITING...
// AS --> hold --> VARUN -->

class Calling {

	public synchronized void runningCall(int flag) {

		System.out.println("call is running....");
		if (flag == 1) {

			System.out.println("new call is on wait..");
			System.out.println("current call is putting on hold");
			System.out.println("new call is about to pick..");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("holded call is picked.");
			System.out.println("call ended...");

		}

	}

	public synchronized void newCall() {

		System.out.println("new call received...");
		System.out.println("new call is running...");
		System.out.println("new call is about to end...");
		System.out.println("new call is ended..");
		System.out.println("Notifying to holded call...");
		notify();

	}

}

class Call1 extends Thread {

	Calling c;

	public Call1(Calling c) {

		this.c = c;
	}

	@Override
	public void run() {

		c.runningCall(1);
	}

}

class Call2 extends Thread {

	Calling c;

	public Call2(Calling c) {

		this.c = c;
	}

	@Override
	public void run() {
		c.newCall();
	}

}

public class InterThread {

	//
	
	
	
	public static void main(String[] args) {
		
		Calling calling = new Calling();
		Call1 t1 = new Call1(calling);
		Call2 t2 = new Call2(calling);
		
		t1.start();
		t2.start();
		
		
		
	}
}
