package exceptions;

public class MyNewException extends Exception {

	public  MyNewException(String s) {
		super(s); // This call the constructor of Exception class 
	}
}