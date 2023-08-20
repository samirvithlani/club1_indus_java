package com.oops.inheritance1;

import java.util.Scanner;

import com.oops.inheritance.Vehicle;

public class Bike extends Vehicle {

	
	void getBikeData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter make year");
		makeYear = sc.nextInt();
		System.out.println("enter bike name");
		vehname = sc.next();
		System.out.println("enter bike cap");
		cap = sc.nextInt();
	}
	
	void printBikeData() {
		
		System.out.println("bike name = "+vehname);
		System.out.println("bike cap = "+cap);
		System.out.println("bike make year = "+makeYear);
	}
	public static void main(String[] args) {
		
		
		Bike b = new Bike();
		b.getBikeData();
		b.printBikeData();
		
	}
}
