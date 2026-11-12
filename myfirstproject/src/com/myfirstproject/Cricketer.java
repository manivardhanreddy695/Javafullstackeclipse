package com.myfirstproject;

public class Cricketer {
	static String countryName;
	static String boardName;
	
	String cricketerName;
	int jerseyNO;
	int heighestScore;

	public static void main(String[] args) {
		System.out.println("welcome to the cricketers club");
		
		
		Cricketer raina = new Cricketer();
		countryName = "India";
		boardName = "BCCI";
		
		System.out.println("countryName:" +	countryName);
		System.out.println("boardName:" +	boardName);
		 
		raina.cricketerName = "sureshRaina";
		raina.jerseyNO = 13;
		raina.heighestScore = 97;
		
		System.out.println("cricketerName :" + raina.cricketerName);
		System.out.println("jerseyNO :" + raina.jerseyNO);
		System.out.println("heighestScore :" + raina.heighestScore);
		
		countryName = "India";
		boardName = "BCCI";
		
		Cricketer shreyas  = new Cricketer();
		
		shreyas.cricketerName = "shreyasIyer";
		shreyas.jerseyNO = 12;
		shreyas.heighestScore = 102;
		
		System.out.println("cricketerName :" + shreyas.cricketerName);
		System.out.println("jerseyNO :" + shreyas.jerseyNO);
		System.out.println("heighestScore :" + shreyas.heighestScore);
		
		
		

		


		

	}

}
