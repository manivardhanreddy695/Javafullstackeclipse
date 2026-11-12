package com.myfirstproject;

public class Garbage {
	int id;
	String name;

	@Override
	protected void finalize() {
		System.out.println("Garbage collection process ");
	}

	void mani() {
		System.out.println("collected");
	}

	public static void main(String[] args) {

		Garbage g1 = new Garbage();
		System.out.println(g1);

		Garbage g2 = new Garbage();
		System.out.println(g2);

		Garbage g3 = new Garbage();
		System.out.println(g3);

		Garbage g4 = new Garbage();
		System.out.println(g4);

		g1 = null;
		// g2 = null;

		g2.mani();

		g2 = g4;

		new Garbage();

		System.gc();

	}

}
