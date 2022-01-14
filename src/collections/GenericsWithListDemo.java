package collections;

// Java is a Type-safe language which means that whenever you use any data, that should be type safe
// Example: if we are working with numbers, the List should support only the numbers and not the String or other objects.
// To achieve that, we use concept called Generics with <> symbol
// In Java version 1.7 or above, we can create List as List<Integer> values = new ArrayList<>();
// Mentioning the type is not mandatory on the right hand side

import java.util.ArrayList;
import java.util.List;

public class GenericsWithListDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		// This List is of Object data type which support objects but now I want it to contains specific data only 
		values.add(4); 
		// values.add("Rajat"); This line shows compile error because we are adding String in an Integer type of List 
		values.add(6);
		values.add(9);
		values.add(2);

		for (Integer o : values) {
			System.out.println(o);
		}
	}
}