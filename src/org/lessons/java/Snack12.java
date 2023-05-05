package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Lng = arr1.length;
		int arr2Lng = arr2.length;
		int totLng = arr1Lng + arr2Lng;
		
		Integer[] resultArr = new Integer[totLng];
		
		for (int i=0; i<arr1Lng; i++) {
			resultArr[i] = arr1[i];
		}
		
		for (int i=arr1Lng; i<totLng; i++) {
			resultArr[i] = arr2[i - arr1Lng];
		}
		
		System.out.println(Arrays.asList(resultArr));
	}
}
