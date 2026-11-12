package com.myfirstproject;

public class Methods {
	int a;
	int b;
	String Name;
	
	int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	int sub(int a, int b) {
		int diff = a-b;
		return diff;
		
	}
	
	int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	
	
	String Name(String Name) {
		String name = "Rolex";
		return name;
	
	}
	
	

	public static void main(String[] args) {
     
		Methods m = new Methods();
		System.out.println("Enter addtition value :" + m.add(3,5));
		System.out.println("Enter value :" + m.sub(3,5));
		System.out.println("Enter value :"  +m.multiply(2,4));
	      System.out.println("Enter Name :" + m.Name("Rolex"));
		
		
	}

}
