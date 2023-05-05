package org.lessons.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] newArr1 = new Integer[5];
		Integer[] newArr2 = new Integer[5];
		
		for (int i=0; i<5; i++) {
			if (i < 1) {
				newArr1[i] = arr2[i];
				newArr2[i] = arr1[i];
			} else {
				newArr1[i] = arr1[i];
				newArr2[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.asList(newArr1));
		System.out.println(Arrays.asList(newArr2));
	}
}
