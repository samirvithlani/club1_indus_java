package com.collections.list;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int sId;
	String sName;
	public Student(int sId, String sName) {
		
		this.sId = sId;
		this.sName = sName;
	}
	
	
	
}
public class ListDemo3 {

	
	public static void main(String[] args) {
		
		
		List<Student> students  = new ArrayList<Student>();
		Student s1 = new Student(101, "ram");
		Student s2 = new Student(102, "seeta");
		
		students.add(s1);
		students.add(s2);
		students.add(new Student(103, "lakshman"));
		
		for(int i=0;i<students.size();i++) {
			
			System.out.println(students.get(i).sId + " - "+students.get(i).sName);
		}
		
//		for(Student s:students) {
//			
//			System.out.println(s.sId + " " +s.sName);
//		}
		
		
		
		
		
	}
}
