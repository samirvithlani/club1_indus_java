package com.lambda;

interface CheckLen {

	int getLen(String str, char c);
}

public class LambdaDemo5 {

	public static void main(String[] args) {

		CheckLen c1 = (str, c) -> {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == c) {

					count++;
				}

			}
			return count;

		};
		int cnt = c1.getLen("hi this is india india is my country.", 'n');
		System.out.println(cnt);

	}
}
