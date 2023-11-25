package com.file.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class SerilizeDemo {

	public static void main(String[] args) {

		Student s1 = new Student(101, "raj");
		// data seriized...
		// ObjectOutPutStream
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"));
			out.writeObject(s1);
			out.close();
			System.out.println("data has been serilized...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
