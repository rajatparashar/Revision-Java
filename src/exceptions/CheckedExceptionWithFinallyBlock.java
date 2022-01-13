package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedExceptionWithFinallyBlock {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number ");

		
		// The below synax is called as 'Try with Resource', where we declare the resource inside the round brackets with try
		// With this syntax there is not need to close the resources, it will be automatically closed once the control comes out of the try block
		// Also, with this syntax there is not need to use finally block to close the resorce
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
	}

}