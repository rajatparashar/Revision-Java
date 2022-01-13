package exceptions;

// There are two types of Exception - Checked and Unchecked
// When compiler knows about the Exception, it is called as Checked Exception
// When compiler does not prompt you about the Exception, it is called as Unchecked Exception
// IOException is not the part of RuntimeException
// So ONLY RuntimeException and its sub-classes are Unchecked, remaining all other Exceptions are Checked Exceptions.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourceDemo {

	public static void main(String[] args) throws Exception { 

		System.out.println("Enter a number ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // compile error: "Unhandled exception type IOException" ,  if we don't handle this statement
		// the above line can give the Exception, because, in case of the user enter a value which cannot be converted into an Integer
		// and compiler knows about this, so Compiler shows compile time error asking us to handle the Exception which might occur after user input
		// Either use try catch block or use throws with main() method 
				
		
		BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br1.readLine());
			System.out.println(num);
			br1.close();  // If exception occurs on line 30, so this line will not be executed so the resource will not be able to get closed.
			// Hence it is always a better idea to close the resources in finally block  
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// here 'br' is a resource
		// The classes which come from io package, they are resources, which means after using a resource we have to close it.
		// If we don't close the resource, it will occupy the memory
		
		finally {
			br.close(); // closing the resource 
			br1.close();
		}
		System.out.println(n);
	}

}
