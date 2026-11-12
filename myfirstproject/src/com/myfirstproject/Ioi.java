package com.myfirstproject;

class A {
	A a;
	
	}


public class Ioi {
	protected void finalize() {
		System.out.println("finalized");
	}

	public static void main(String[] args) {

		System.out.println("island of isolation ");

		A a1 = new A();
		A a2 = new A()
;		
		a1.a = a2;
		a2.a = a1;
		
		a1= null;
		
		System.gc();

	}

}
