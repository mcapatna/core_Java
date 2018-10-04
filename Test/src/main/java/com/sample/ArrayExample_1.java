package com.sample;

import java.util.Arrays;
import java.util.List;

public class ArrayExample_1 {

	public static void main(String[] args) {
		int arr[] = { 1, 15, 25, 3, 75, 22 };
		int arr1[] = { 1, 15, 25, 3, 75, 22 };
		Integer arr2[] = { 1, 2, 9, 7, 3, 2, 4 };
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println("\nAre arr and arr1 equal? s: "+Arrays.equals(arr, arr1));
		System.out.println("\nAfter Sorting\n");
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println("-------------");
		System.out.println("\n7099 Found at index:" + Arrays.binarySearch(arr1, 7099));
		System.out.println("\n75 Found at index:" + Arrays.binarySearch(arr1, 75));
		System.out.println("\nAre arr and arr1 equals [after sorting one array]? : "+Arrays.equals(arr, arr1));
		
		Arrays.fill(arr1, 4343);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		List<Integer> ar=Arrays.asList(arr2);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(""+ar.get(i));
		}
		
	}

}
