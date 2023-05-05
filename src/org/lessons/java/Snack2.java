package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] namesList = {
				"Homer",
				"Lisa",
				"Bart",
				"Marge",
				"Ned"
		};
		
		String[] surnamesList = {
				"Simpsons",
				"Peterson",
				"Flanders",
				"Sanders",
				"Willis"
		};
		
		Random rand = new Random();
		
		for (int i = 0 ; i<5 ; i++) {
			
			int randIntForName = rand.nextInt(5);
			String randomName = namesList[randIntForName];
			int randIntForSurname = rand.nextInt(5);
			String randomSurname = surnamesList[randIntForSurname];
			
			System.out.println(randomName + " " + randomSurname);
		}
	}
}
