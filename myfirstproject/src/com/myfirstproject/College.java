package com.myfirstproject;

public class College {
	static String collegeName;
	static String principleName;

	int studentId;
	String studentName;
	String courseName;
	int marks;

	void display() {
		System.out.println(College.collegeName);
		System.out.println(College.principleName);
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(courseName);
		System.out.println(marks);

	}

	static void chalapathi() {
		collegeName = "chalapathi ";
		principleName = "nageswar rao";

	}

	void changePrinciple(String newprinciple) {
		principleName = newprinciple;

	}

	public static void main(String[] args) {
		College mani = new College();
		mani.studentName = "mani vardhan reddy";
		mani.studentId = 22126;
		mani.courseName = "artificial intelligence";
		mani.marks = 100;
		chalapathi();
		mani.changePrinciple("Rama rao");
		mani.display();
	}

}
