package com.collections.predicate;

import java.util.function.Predicate;

import javax.swing.border.EmptyBorder;

class Employee {

	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
	
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}

public class PredicateDemo2 {

	

	public static void main(String[] args) {
		Predicate<Employee> isEligible = x -> x.age > 18 && x.name.startsWith("a");
		System.out.println(isEligible.test(new Employee(101, "amit", 21)));
		
		
		
	}
}
