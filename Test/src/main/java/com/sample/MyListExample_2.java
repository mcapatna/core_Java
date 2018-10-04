package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;

import com.sample.model.Employee;

public class MyListExample_2 {

	public static void main(String[] args) {
		Iterable<Employee> it = new ArrayList<>();
		Employee emp;
		for(int i=0;i<10;i++) {
			emp=new Employee(1, "Emp- 0"+i);
			((LinkedList<Employee>) it).add(emp);
			emp=null;
		}
		for(Employee e:it) {
			System.out.println(e);
		}

	}

}
