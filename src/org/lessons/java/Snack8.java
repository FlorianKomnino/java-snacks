package org.lessons.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {		
//		List<Integer> evenArr = new ArrayList<Integer>();
//		List<Integer> oddArr = new ArrayList<Integer>();
		
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];
		
		Integer oddInd = 0;
		Integer evenInd = 0;
		
		Random randNum = new Random();
		
		for (int i=0 ; i<10 ; i++) {
			Integer randInt = randNum.nextInt(100);
			
			if (randInt % 2 == 0) {
				evenArr[evenInd] = randInt;
				evenInd++;
			} else {
				oddArr[oddInd] = randInt;
				oddInd++;
			}
		}
		System.out.println("The list of even numbers is:");
		System.out.println(Arrays.asList(evenArr));
		System.out.println("The list of odd numbers is:");
		System.out.println(Arrays.asList(oddArr));
	}
}
