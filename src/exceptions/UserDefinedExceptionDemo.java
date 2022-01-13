package exceptions;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		int i, j;
		i = 8;
		j = 9;

		try {
			int k = i / j;
			
			if(k == 0) {
				throw new MyNewException("This is not acceptable"); // throwing my class of Exception
			}
			
			System.out.println(k);
		} catch (MyNewException e) { // accepting the Exception of my class
			System.out.println("Error "+e.getMessage()); // Output: Error This is not acceptable
		}
	}
}