package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {

		System.out.println("press 1 for create file ..");
		System.out.println("press 2 for create folder ..");
		System.out.println("press 3 for check file / folder is exist or not");
		System.out.println("press 4 for check given is file or folder..");
		System.out.println("press 5 for delete file...");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		File file = null;

		switch (choice) {

		case 1:
			System.out.println("enter file name to create...");
			String fname = sc.next();
			file = new File(fname);
			try {
				if (file.createNewFile()) {

					System.out.println(fname + " is created...");
				} else {

					System.out.println("error..");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 2:
			System.out.println("enter folder name to create..");
			String folName = sc.next();
			file = new File(folName);
			if (file.mkdir()) {
				System.out.println(folName + " folder created..");
			} else {

				System.out.println("not created...");
			}

			break;
		case 3:
			String ffname = sc.next();
			file = new File(ffname);
			if (file.exists()) {

				System.out.println(ffname + "is exsist..");
			} else {

				System.out.println(ffname + " is not exist..");
			}
			break;
		case 4:
			System.out.println("please enter file or folder name..");
			ffname = sc.next();
			file = new File(ffname);
			if(file.isFile()) {
				
				System.out.println(ffname+" is file.");
			}
			else if(file.isDirectory()) {
				
				System.out.println(ffname + " is folde..");
			}
			else {
				
				System.out.println(ffname + "is not exist...");
			}
			break;
			
		case 5:
				System.out.println("enter file name to delete..");
				fname = sc.next();
				file = new File(fname);
				if(file.exists()) {
						
					if(file.delete()) {
						
						System.out.println(fname +" is deleted..");
					}
					else {
						System.out.println(fname +" is not deleted..");
						
					}
					
				}
				else {
					
					System.out.println(fname + " is not exsit..");
					
				}
			break;

		}

	}
}
