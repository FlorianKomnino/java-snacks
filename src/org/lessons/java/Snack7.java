package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int foundNum = 1;
		
		while (foundNum % 3 != 0 || foundNum % 5 != 0) {
			int randInt = rand.nextInt(100);
			foundNum = randInt;
			System.out.println("The random  number is: " + foundNum);
		}
		
		System.out.println("The first found number divisible with 3 and 5 entirely is: " + foundNum);
	}
}
