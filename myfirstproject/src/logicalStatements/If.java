package logicalStatements;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		

				System.out.println(" main method started");
				System.out.println(" positive or negative number display");

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter a number: ");
			
				int num = sc.nextInt();
				
				if (num > 0) {

					System.out.println("Given number is Positive ");
				} else {
					System.out.println("Given number is Negative");

				}

				sc.close();

			}

		

	}


