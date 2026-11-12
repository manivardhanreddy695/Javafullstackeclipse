package com.myfirstproject.Constructors;

public class Student {
	int sId;
	String sName;
	double sGpa;
	
	Student(){
		System.out.println("no args called");
	}
	Student(int sId,String sName,double sGpa){
		this.sId = sId;
		this.sName = sName;
		this.sGpa = sGpa;
		
	}
	
	Student(int A,String B,int C){
		sId = A;
		sName =B;
		sGpa = C;
		
	}
	
	void Stu() {
		System.out.println("----------------------------");
		System.out.println(sId);
		System.out.println(sName);
		System.out.println(sGpa);
		System.out.println("----------------------------");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1 = new Student(1,"mani",8.5);
		Student s2 = new Student(2,"ganga",9.0);
		
		s1.Stu();
		s2.Stu();
		System.out.println("main method ended");
		Student s3 = new Student(3,"ganga",9);
		s3.Stu();
		
		
		
		
		
				

	}

}
