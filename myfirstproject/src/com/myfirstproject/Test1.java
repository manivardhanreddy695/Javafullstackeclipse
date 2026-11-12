package com.myfirstproject;

public class Test1 {

	static void mani1() {
		System.out.println("mani vardhan");
		mani2();
	}

	static void mani2() {

		System.out.println("reddy");
		Test1 mani = new Test1();
		mani.mani3();
	}

	void mani3() {
		mani4();
		System.out.println("chirra");

	}

	void mani4() {
		System.out.println("koppunuru");
		Test1 v = new Test1();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method ended");
		mani1();

	}

}
