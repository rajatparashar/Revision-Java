package scanner;

// In constructor of Scanner, we need to pass the parameter 
// The parameter 'System.in' tells that the input will be taken from input
// Advantages of using Scanner class is- you don't have to handle the Exception
// Second advantage is -  you don't have to convert the String into Integer

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter a number ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n);
	}
}