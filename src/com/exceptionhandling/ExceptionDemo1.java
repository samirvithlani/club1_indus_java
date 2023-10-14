package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

///array index outofboud excpetion..
public class ExceptionDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter No 1:");
			int no1 = sc.nextInt();
			System.out.println("enter no 2 :");
			int no2 = sc.nextInt();

			int ans = no1 / no2;

			System.out.println("ans" + ans);
		} catch (ArithmeticException e) {

			System.out.println("can not divide by zero");
		} catch (InputMismatchException e) {

			System.out.println("please enter digits only...");
		} catch (Exception e) {

			System.out.println("error....");
		}

	}
}
