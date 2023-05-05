package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert a string to check if it's a palyndrome:");
		String userInput = sc.nextLine();
		sc.close();
		
		int strLng = userInput.length();
		
		for (int i=0 ; i<strLng/2 ; i++) {
			int revInd = strLng - i - 1;
			
			if (userInput.charAt(i) != userInput.charAt(revInd)) {
				System.out.println("The string is not a palyndrome.");
				return;
			}
		}
		System.out.println("Great! The string is a palyndrome");
	}
}
