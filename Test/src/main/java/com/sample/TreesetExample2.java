package com.sample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sample.model.Employee;

public class TreesetExample2 {
	public static void main(String[] args) {
		Set mySet = new TreeSet();
//		mySet.add(null);
		
		mySet.add(new Employee(10, "sda"));
		int i = 9;
		mySet.add(new Student(13, "name-0" + i));
		/*mySet.add(new Student(12, "name-0" + i));
		mySet.add(new Student(13, "name-0" + i));
		mySet.add(new Student(1, "name-0" + i));
		mySet.add(new Student(5, "name-0" + i));
		mySet.add(new Student(90, "name-0" + i));
		mySet.add(new Student(76, "name-0" + i));
		mySet.add(new Student(7, "name-0" + i));
		mySet.add(new Student(8, "name-0" + i));
		mySet.add(new Student(65, "name-0" + i));
		mySet.add(new Student(99, "name-0" + i));
		mySet.add(new Employee(10, "sda"));
		Iterator<Student> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/

	}
}

class Student implements Comparable<Student> {
	private int roll;
	private String name;

	@Override
	public int compareTo(Student obj) {
		return this.roll - obj.roll;
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}
