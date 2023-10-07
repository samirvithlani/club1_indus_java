package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder();
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		// sb.reverse();
		// sb.append(" python this is new capaciti,,,,,,, test...kjhuhknnn");
		// System.out.println(sb.codePointBefore(2));
		// 0 1 2 3
		// String s = sb.substring(0,6);
//		System.out.println("ss ===>"+s);
//		System.out.println(sb);
//		
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.append("ok");
		sb1.append("");
		System.out.println(sb.capacity());

		// #javaok
		// sb.replace(0,6, "#");

		// sb.delete(0, 3);
		// sb.deleteCharAt(0);

		sb.insert(1, "royal");
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb.capacity());

	}
}
