package com.sample.model;

public class Student {
	private int roll;
	private String name;

	public int compareTo(Object obj) {
		Student s = (Student) obj;
		return this.roll - s.roll;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.roll == s.roll)
			return true;
		return false;
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
