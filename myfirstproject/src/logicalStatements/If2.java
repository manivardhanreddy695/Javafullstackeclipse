package logicalStatements;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		System.out.println(" main method started");
		System.out.println(" Even os Odd  number display");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
	
		int num = sc.nextInt();
		
		if (num%2 == 0) {

			System.out.println("Given number is even number ");
		} else {
			System.out.println("Given number is odd number");

		}

		sc.close();

	}

}
