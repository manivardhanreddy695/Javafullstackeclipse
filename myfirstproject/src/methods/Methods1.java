package methods;

public class Methods1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
	//static method loads whenever the class loads 
		
		hello();// calling the methods : 
		// static methods can call directly  
// 	whenever we created an object 	
//instance methods are loading into hep memory
		
		Methods1 M1 = new Methods1();
		M1.welcome();
		System.out.println("main method ended");
	}

	 static void hello () {
		System.out.println(" good morning ");
		
		
	}
	void welcome () {
		//if we want to call instance methods
		//we must need to create object
		System.out.println(" welcome to v cube");
		
				
	}
}
