package methods;

// wap calculate the values using the methods 
///no return type no parameters 
public class Methods2 {
	void addition() {
		System.out.println("addition method called");
		int a = 50;
		int b = 20;
		System.out.println(a + b);
		System.out.println("--------------------------------------------");

	}

	void substraction() {
		System.out.println("substraction method called ");
		int a = 980;
		int b = 978;
		System.out.println(a - b);
		System.out.println("--------------------------------------------");

	}

	void multiplication() {
		System.out.println("multiplication called ");
		int a = 112;
		int b = 3;
		System.out.println(a * b);
		System.out.println("--------------------------------------------");

	}
// division will give quotient 
	void division() {
		System.out.println("division called ");
		int a = 1000;
		int b = 500;
		System.out.println(a / b);
		System.out.println("--------------------------------------------");

	}

// modulus will give you reminder 	
	void modulus() {
		System.out.println(" modulus method called ");
		int a = 10;
		int b = 3;
		System.out.println(a%b);
		System.out.println("--------------------------------------------");

	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		Methods2 m = new Methods2();
		
		m.addition();
		m.substraction();
		m.multiplication();
		m.division();
		m.modulus();
		
		

		System.out.println("main method ended ");

	}

}
