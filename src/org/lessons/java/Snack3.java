package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		int[] numList = {
			3,
			5,
			84,
			12,
			33,
			48,
			88
		};
	
		int sum = 0;
		int listLng = numList.length;
	
		for (int i=0 ; i<listLng ; i++) {
			if (i % 2 != 0) {
				sum += numList[i];
			}
		}
		
		System.out.println(sum);
	}

}
