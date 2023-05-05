package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number:");
		int userNum = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=userNum ; i++) {
			if (userNum % i == 0) {
				System.out.println("The number '" + i + "' divides with integer result the given number");
			}
		}
	}
}
