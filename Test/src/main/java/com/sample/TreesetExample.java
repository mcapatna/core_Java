package com.sample;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {
	public static void main(String[] args) {
		String[] intArray = { "Deepak", "Kumar", "Azad", "Swamy" };
		Set<String> mySet = new TreeSet<>(Arrays.asList(intArray));
		System.out.println(mySet);

	}
}
