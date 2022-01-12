package exceptions;

// Multiple Exceptions in a single catch block was introduced in Java 1.7 version and it will not work in Java 1.6 or below

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			int arr[] = new int[6];
			arr = null; //Exception in thread "main" java.lang.NullPointerException , but it will be handled by Exception block
			arr[3] = 2; // It will give 
			arr[6] = 8; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
			
			int i = 7;
			int j = 0;
			int k = i / j;
			
			System.out.println("Output is " + k); // This line will not be printed if j = 0
		}
		
		/*
		If we use Exception block here it will give unreachable code at other exceptions blocks because this block will handle every type Exception, then there will be no need of other Exceptions blocks 
		
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		*/
		
		/*
		The below catch blocks alos work normally, but to show another way of doing it, these below lines have been commented out.
		
		catch (ArithmeticException e) { //This catch can handle only Arithmetic Exceptions 
			System.out.println("Cannot divide by Zero"); 
		}
		catch (ArrayIndexOutOfBoundsException e) { //This catch can handle only Arithmetic Exceptions 
			System.out.println("Stay in your limit.."); 
		}
		
		*/
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
		
		//It is always better to put the Exception catch block at last because all the Exception classes in hierarchy are the sub-classes of Exception class
		//and it handle every type of Exception
		
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		
		finally {
			System.out.println("Bye"); // This statement will be executed even after the Exception is occurred.
		}
	}
}