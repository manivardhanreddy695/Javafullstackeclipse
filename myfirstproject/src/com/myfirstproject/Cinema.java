package com.myfirstproject;

public class Cinema {
	static String heroName = "prabhas";
	static String cinemaName = "bahubali";

	int collections = 1800;
	int year = 2017;

	public static void main(String[] args) {
		System.out.println("welcome to  tollywood ");

		Cinema bB = new Cinema();
		
		System.out.println( heroName);
		System.out.println( cinemaName);
		System.out.println(bB.collections);
		System.out.println( bB.year);

	}  

}