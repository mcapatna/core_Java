package com.sample;

import java.util.HashMap;
import java.util.Map;

import com.sample.model.Employee;

public class MyMap {

	public static void main(String[] args) {
//		Map<Student, Employee> hm=new HashMap<>();
//		System.out.println(hm.put(new Student(1, "sad"), new Employee(empCode, empName)));
		Map<Integer, String>hm= new HashMap<>();
		System.out.println(hm.put(1, "a"));
		System.out.println(hm.put(1, "b"));
		System.out.println(hm.get(1));
		System.out.println(hm.size());
//		hm.
		System.out.println();
	}

}
