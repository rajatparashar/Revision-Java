package exceptions;

// finally block will get executed if we get Exception or not.

public class FinallyWithTryCatchDemo {

	public static void main(String[] args) {
		try {
			int i = 7;
			int j = 0;
			int k = i / j;
			System.out.println("Output is " + k); // This line will not be printed if j = 0
		}
		catch (Exception e) {
			System.out.println("Error"); // This statement will be printed after the Exception is occurred
		}
		finally {
			System.out.println("Bye"); // This statement will be executed even after the Exception is occurred.
		}
	}
}