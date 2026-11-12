package com.myfirstproject.Constructors;

public class Students {
	
	 int studentId;
	String studentName;
	String course;
	
	Students(int studentId,String studentName,String course){
		 this.studentId = studentId;
		 this.studentName = studentName;
		 this.course = course;
		
	}
	

	public Students(Students s2) {
		studentId = s2.studentId;
		 studentName = s2.studentName;
		 course = s2.course;
		
		
		
	}

	public static void main(String[] args) {
		
		Students S1 = new Students(1,"mani","CSE");
		
		Students S2 = new Students(2,"srinu","AI");
		Students S3 = new Students(S2);
		S3.studentId = 3;
		S1.stu();
		S2.stu();
		S3.stu();
		
		
		

	}

	void stu() {
		System.out.println("----------------------------");
		System.out.println("studentid is :"+studentId);
		System.out.println("studentname is :"+studentName);
		System.out.println("course is :"+course);
		
		
	}
}
