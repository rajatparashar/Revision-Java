package exceptions;

public class ExceptionHandlingWithTryCatchDemo {

	public static void main(String[] args) {
		try {
			int i = 7;
			int j = 0; 
			int k = i / j;
			System.out.println("Output is " + k); // This line will not be printed if j = 0
		}
		catch (Exception e) {
			System.out.println("Error"); // This statement will be printed after the Exception is occured
		}
		System.out.println("Bye"); // This statement will be printed after handling the Exception
	}
}