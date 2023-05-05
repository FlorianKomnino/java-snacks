package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number of centimeters for the base of te square:");
		
		int base = sc.nextInt();
		
		System.out.println("Insert a number of centimeters for the height of te square:");
		
		int height = sc.nextInt();
		
		sc.close();
		
		int perimeter = base*2 + height*2;
		int surface = base*height;
		
		System.out.println("The square perimeter with those dimensions is: " + perimeter + "cm");
		System.out.println("The square surface with those dimensions is: " + surface + "cm2");
	}
}
