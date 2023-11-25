package com.file.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizedDemo {

	public static void main(String[] args) {

		//Object..
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
			Student st = (Student)in.readObject();
			System.out.println(st.id);
			System.out.println(st.name);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
