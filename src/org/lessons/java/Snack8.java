package org.lessons.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {		
		List<Integer> evenArr = new ArrayList<Integer>();
		List<Integer> oddArr = new ArrayList<Integer>();
		
		Random randNum = new Random();
		
		for (int i=0 ; i<10 ; i++) {
			int randInt = randNum.nextInt(100);
			
			if (randInt % 2 == 0) {
				evenArr.add(randInt);
			} else {
				oddArr.add(randInt);
			}
		}
		
		System.out.println(Arrays.asList("The list of even numbers is" + evenArr));
		System.out.println(Arrays.asList("The list of odd numbers is" + oddArr));
	}
}
