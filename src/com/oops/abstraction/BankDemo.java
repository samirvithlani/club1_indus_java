package com.oops.abstraction;

abstract class RBI {

	// variable declarion no rules..
	public abstract void withdraw();

}

class SBI extends RBI {

	public void mySBI() {
		System.out.println("mysbi");
	}

	public void withdraw() {

		System.out.println("sbi withdraw...");

	}

}

class ICICI extends RBI {

	public void withdraw() {

		System.out.println("icici withdraw...");

	}

}

public class BankDemo {

	public static void main(String[] args) {

		RBI s = new SBI();
		s.withdraw();

		RBI i = new ICICI();
		i.withdraw();

	}
}
