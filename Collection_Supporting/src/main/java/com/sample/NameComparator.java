package com.sample;

import java.util.Comparator;

import com.sample.model.Student;

public class NameComparator implements Comparator<Student> {
	int sid;
	String sname;
	String email;

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}

	@Override
	public String toString() {
		return "Example_Comparable [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}

	public  NameComparator(int sid, String sname, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
