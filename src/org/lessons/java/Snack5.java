package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Chose a number:");
		int userNum = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int oddsCount = 0;
		float avg = 0;
		float oddAvg = 0;
		int minNum = Integer.MAX_VALUE;
		int maxNum = Integer.MIN_VALUE;
		
		Random rand = new Random();
		
		for (int i=0 ; i<userNum ; i++) {
			int randInt = rand.nextInt(100);
			System.out.println(randInt);
			
			sum += randInt;
	
			if (randInt % 2 == 0) {
				evenSum += randInt;
			} else {
				oddsCount++;
				oddSum += randInt;
			}
			
			if (randInt < minNum) {
				minNum = randInt;
			}
			
			if (randInt > maxNum) {
				maxNum = randInt;
			}
		}
		
		avg = sum / userNum;
		if (oddsCount > 0) {			
			oddAvg = oddSum / oddsCount;
		}
		
		System.out.println("The total sum is: " + sum);
		System.out.println("The total sum of even numbers is: " + evenSum);
		System.out.println("The total average is: " + avg);
		if (oddsCount == 0) {
			System.out.println("No odd numbers found randomly");
		} else {			
			System.out.println("The odd numbers average is: " + oddAvg);
		}
		System.out.println("The lowest number is: " + minNum);
		System.out.println("The highest number is: " + maxNum);
		
		

	}
}
