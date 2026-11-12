package com.myfirstproject.Constructors;

public class Stu {
	int studentId;
	String studentName;
	String branch;
	int marks;
	double gpa;
	String village;

	Stu() {

		this(1);
	}

	public Stu(int studentId) {
		this(1, "mani","CSE AI",98);

	}

	public Stu(int studentId, String studentName) {
		
	}

	public Stu(int studentId, String studentName, String branch) {
		

	}

	public Stu(int studentId, String studentName, String branch, int marks) {
		this(1, "mani", "CSE AI", 99, 8.5);

	}

	public Stu(int studentId, String studentName, String branch, int marks, double gpa) {
		this(1, "mani", "CSE AI", 99, 8.5, "KOPPUNURU");
	}

	public Stu(int studentId, String studentName, String branch, int marks, double gpa, String village) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
		this.marks = marks;
		this.gpa = gpa;
		this.village = village;
	}

	public static void main(String[] args) {
		System.out.println("constructors practice");
		Stu s1 = new Stu();
		Stu s2 = new Stu(2,"srinu","ece",90,7.5,"sagar");
		Stu s3 = new Stu(3,"PRABHA","CIVIL",95,8.5,"sagar");
		
		s1.stuinfo();
		s2.stuinfo();
		s3.stuinfo();
		

	}

	void stuinfo() {
		System.out.println("----------------------------------------");
		System.out.println("student id is :" + studentId);
		System.out.println("studentName id is :" + studentName);
		System.out.println("marks  are :" + marks);
		System.out.println("Branch is :" + branch);
		System.out.println(" gpa is :" + gpa);
		System.out.println("village is :" + village);
		
	}
}
