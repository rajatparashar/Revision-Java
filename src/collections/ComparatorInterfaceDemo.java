package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// In this class we will use the Comparator Interface
// Problem statement: Sort the list of Integers based on the unit(last) digit
// For example:
// If the input is list -> [908, 404, 639, 265]
// The output should be -> [404, 265, 908, 404]
// The Comparator interface is a Functional Interface, so we can use Lambda expression with it
public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(908);
		values.add(404);
		values.add(639);
		values.add(265);

		// Collections.sort(values); This sort is declared in Comparable interface
		// The Integer class implements Comparable interface and provide the implementation to compareTo method
		// So the logic to sort is already provided but in our case the logic need to be changed, so we can override the existing logic for sort which is defined by Integer class
		// Apply logic as below

		Comparator<Integer> c = ( i,  j) -> (i % 10 > j % 10) ? 1 : -1;
		// The above statement is the overridden method 'compare' wusing Lambda expression
		Collections.sort(values, c);

		for (Integer o : values) {
			System.out.println(o);
		}
		
		/*
		  The output is 
		  404
		  265
		  908
		  639
		 */
	}
}