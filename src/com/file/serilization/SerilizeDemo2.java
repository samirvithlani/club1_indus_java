package com.file.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	int id;
	String eName;
	double eSalary;

	public Employee(int id, String eName, double eSalary) {

		this.id = id;
		this.eName = eName;
		this.eSalary = eSalary;
	}

}

public class SerilizeDemo2 {

	public void getEmployeeArrayFromFile() {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser"));
			Employee emps[] = (Employee[]) in.readObject();
			for (Employee e : emps) {

				System.out.println(e.id + " " + e.eName + " " + e.eSalary);
			}
			in.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void storeEmployeeData() {

		Employee e1 = new Employee(101, "raj", 45678.90);
		Employee e2 = new Employee(102, "amit", 67896.9);
		Employee e3 = new Employee(103, "ajay", 120000);

		Employee employees[] = new Employee[3];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
//			out.writeObject(e1);
//			out.writeObject(e2);
//			out.writeObject(e3);
			out.writeObject(employees);
			out.close();
			System.out.println("data has been serilized...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		SerilizeDemo2 ser = new SerilizeDemo2();
		//ser.storeEmployeeData();
		ser.getEmployeeArrayFromFile();
	}
}
