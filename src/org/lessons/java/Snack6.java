package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a limit number:");
		int userLimitNum = sc.nextInt();
		sc.close();
		
		int sum = 0;
		Random rand = new Random();
		
		while (sum<userLimitNum ) {			
			int randInt = rand.nextInt(100);
			sum += randInt;
			System.out.println("The random number is: " + randInt);
			System.out.println("The sum is: " + sum);
		}
		
		System.out.println("The limit number has been reached!");
		
		
	}
}
