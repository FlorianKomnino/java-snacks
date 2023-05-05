package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert a string to check if it's a palyndrome:");
		
		String userInput = sc.nextLine();
		int strLng = userInput.length();
		
		Boolean isPalyndrome = false;
		
		int reverseIndex = strLng - 1;
		
		for (int i=0 ; i<strLng ; i++) {
			if (userInput.charAt(i) == userInput.charAt(reverseIndex)) {
				isPalyndrome = true;
				reverseIndex--;
			} else {
				System.out.println("The given string is not a palyndrome");
				return;
			}
		}
		
		if (isPalyndrome == true) {
			System.out.println("Great! The given string is a palyndrome!!");
		}
		
		sc.close();
	}
}
