package com.myfirstproject;

public class Employee {
	static String companyName = "oracle";

	int eid;
	String ename;
	String departmentName;
	int salary;
    String experience;
    
	public static void main(String[] args) {

		Employee mani = new Employee();

		mani.eid = 1;
		mani.ename = "Mani Vardhan";
		mani.departmentName = "frontend";
		mani.salary = 10000;
		mani.experience = "NO";

		System.out.println(Employee.companyName);
		System.out.println(mani.eid);
		System.out.println(mani.ename);
		System.out.println(mani.departmentName);
		System.out.println(mani.salary);
		System.out.println(mani.experience);

		Employee gopi = new Employee();

		gopi.eid = 2;
		gopi.ename = "Gopikrishna";
		gopi.departmentName = "Database";
		gopi.salary = 20000;

		System.out.println(gopi.eid);
		System.out.println(gopi.ename);
		System.out.println(gopi.departmentName);
		System.out.println(gopi.salary);

		Employee raju = new Employee();

		raju.eid = 3;
		raju.ename = "NagaRaju";
		raju.departmentName = "Backend";
		raju.salary = 25000;
		raju.experience = "1 year";

		System.out.println(raju.eid);
		System.out.println(raju.ename);
		System.out.println(raju.departmentName);
		System.out.println(raju.salary);
		System.out.println(raju.experience);
		
		Employee srinu = new Employee();

		srinu.eid = 4;
		srinu.ename = "Srinivas Reddy";
		srinu.departmentName = "full stack";
		srinu.salary = 50000;
		srinu.experience = "2 years";

		System.out.println(srinu.eid);
		System.out.println(srinu.ename);
		System.out.println(srinu.departmentName);
		System.out.println(srinu.salary);
		System.out.println(srinu.experience);

		Employee arun = new Employee();

		arun.eid = 5;
		arun.ename = "Aurn kumar Reddy";
		arun.departmentName = "fullstack";
		arun.salary = 55000;
		arun.experience = "3 years";
				
		System.out.println(arun.eid);
		System.out.println(arun.ename);
		System.out.println(arun.departmentName);
		System.out.println(arun.salary);
		System.out.println(arun.experience);
		System.out.println(arun.companyName);
		
		
		

	}

}
