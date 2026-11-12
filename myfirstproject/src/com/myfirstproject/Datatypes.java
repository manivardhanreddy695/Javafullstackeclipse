package com.myfirstproject;


public class Datatypes {
	//-128 to 127 values can store 
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	 
	char c;
	boolean boo;

	public static void main(String[] args) {
		Datatypes d1 = new Datatypes();
		
		System.out.println("byte value is:" + d1.b);
		System.out.println("short value is:" + d1.s);
		System.out.println("int value is:" + d1.i);
		System.out.println("long value is:" + d1.l);
		System.out.println("float value is:" + d1.f);
		System.out.println("double value is:" + d1.d);
		System.out.println("char value is:" + d1.c);
		System.out.println("bollean value is:" + d1.boo);

	}

}
