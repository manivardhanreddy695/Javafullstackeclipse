package com.myfirstproject;

public class Mani {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println(Class.forName("com.myfirstproject.Mani"));
		System.out.println(Class.forName("java.lang.System"));

	}

}
