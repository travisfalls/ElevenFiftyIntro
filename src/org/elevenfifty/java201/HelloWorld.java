package org.elevenfifty.java201;

import static java.lang.Math.pow;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello, World!");
		System.out.println("Hello, " + args[0] + "!");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// 12 ^ 2
		System.out.println(pow(12, 2));

		int k = 123;
		String s = String.valueOf(k);
		System.out.println(s);

	}

	public static void foo() {
		System.out.println("foo");
		// System.out.println(i); i is not located in the same method and cannot
		// be called on

	}

}
