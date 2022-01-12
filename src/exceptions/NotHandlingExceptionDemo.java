package exceptions;

// On line 8, which gives an Exception, after the Exception, the program will terminate and no further statement would get executed.

public class NotHandlingExceptionDemo {

	public static void main(String[] args) {

		int i = 9 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("Bye"); // This statement will not be executed due to Exception occured on above line
	}
}