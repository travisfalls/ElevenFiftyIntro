package org.elevenfifty.java201;

public class Factorial {

	public static void main(String[] args) {

		int num = Integer.valueOf(args[0]);
		long total = calculateFactorial(num);
		System.out.println(total);

		// int counter = 1;
		// int total = 1;
		// while(counter <= 7){
		// total *= counter;
		// counter++;
		// System.out.println(total);
		// }
		//
		// System.out.println("");
		// System.out.println("Example");
		// int newCounter = 7;
		// int newerTotal = 1;
		// while(newCounter > 1){
		// newerTotal *= newCounter;
		// newCounter--;
		// System.out.println(newerTotal);
		// }
		//
		// System.out.println("");
		// long newTotal = 1;
		// for(int newerCounter = 2; newerCounter <= num; newerCounter++){
		// newTotal *= newerCounter;
		// }
		// System.out.println(newTotal);
		//
		// Factorial moreStuff = new Factorial();

		// moreStuff.foo(7);

		Factorial stuff = new Factorial();

		System.out.println(stuff.sumMultiples());

		getFibonacci();
	}

	// Method
	// public void foo(int k) {
	//
	// for(int anotherCounter = 2; anotherCounter <= 7; anotherCounter++){
	// k *= anotherCounter;
	// }
	// System.out.println(k);
	// }

	public static long calculateFactorial(int targetNumber) {
		int counter = 1;
		long total = 1;
		do {
			total *= counter;
			counter++;
		} while (counter <= targetNumber);

		return total;
	}

	public static long sumMultiples() {
		long sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		return sum;
	}

	public static void getFibonacci() {
		long first = 0;
		System.out.println(first);
		long second = 1;
		System.out.println(second);
		for (int i = 3; i <= 50; i++) {
			long next = first + second;
			System.out.println(next);
			first = second;
			second = next;
		}
	}

}
