package com.thread;

class Line {

	public  void getTrack(int no) {

		// stattion...
		System.out.println("someone is buying ticket...");
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {

				System.out.println(no + "   Train is running...");
			}
		}
		
		System.out.println("someone is crossing platforms");
		// stattion....
		// canteen..

		// ...
	}

}

class Train1 extends Thread {

	Line l;

	public Train1(Line l) {

		this.l = l;
	}

	@Override
	public void run() {
		l.getTrack(1121);
	}
}

class Train2 extends Thread {

	Line l;

	public Train2(Line l) {

		this.l = l;
	}

	@Override
	public void run() {
		l.getTrack(2344);
	}

}

public class SyncronizedBlockDemo {

	public static void main(String[] args) {

		Line l = new Line();
		Train1 t1 = new Train1(l);
		Train2 t2 = new Train2(l);
		t1.start();
		t2.start();

	}
}
