package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number of centimeters for a radius dimension:");
		int userRadius = sc.nextInt();
		sc.close();
		
		double surface = userRadius * userRadius * 3.14;
		double perimeter = userRadius * 2 * 3.14;
		
		System.out.println("The circle's surface is :" + surface + "cm2");
		System.out.println("The circle's perimeter is :" + perimeter + "cm");
	}
}
