package com.thread;

class Bank {

	int userBal = 0;

	public synchronized void withdraw(int amount) {
		System.out.println("welcome to hdfc withdraw...");
		System.out.println("please wait we are fetching your balance...");

		try {
			wait();
			if (amount > userBal) {
				System.out.println("not enougn balance...");
			} else {
				System.out.println("withdraw successfull...");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void checkBal() {

		System.out.println("checking balance......");
		this.userBal = 20000;
		System.out.println("returning to withdraw...");
		notify();

	}
}

class Thread01 extends Thread {

	Bank b;

	public Thread01(Bank b) {

		this.b = b;
	}

	@Override
	public void run() {

		b.withdraw(50000);
	}

}

class Thread02 extends Thread {

	Bank b;

	public Thread02(Bank b) {

		this.b = b;
	}

	@Override
	public void run() {

		b.checkBal();
	}

}

public class InterThread2 {

	public static void main(String[] args) {

		Bank bank = new Bank();

		Thread01 t1 = new Thread01(bank);
		Thread02 t2 = new Thread02(bank);

		t1.start();
		t2.start();

	}
}
