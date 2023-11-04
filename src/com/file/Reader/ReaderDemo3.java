package com.file.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderDemo3 {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Samir\\Desktop\\ms.txt");
		int count =0;
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {

//				System.out.println(sc.next());
				System.out.println(sc.nextLine());
				count++;
			}

			System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
