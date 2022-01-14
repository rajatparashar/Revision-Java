package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// List is mutable, which means its values can be changed

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(4); 
		values.add(9);
		values.add(6);
		values.add(2);
		
		// I want to apply sort on my list
		// Collections is an API which provide multiple features, and sorting is one of them
		// Using below way, sort can be applied on list
		
		Collections.sort(values);
		// Collections is a class and sort is a static method, which is called with class name
		// By default sort method, sorts in ascending order

		for (Integer o : values) {
			System.out.println(o);
		}
		
		/*
		 This prints below output
		 2
		 4
		 6
		 9
		 */
		// To make the list in descending order, we can reverse the list which is already in ascending order as below
		Collections.reverse(values);
		/*
		 This prints below output
		 9
		 6
		 4
		 2
		 */
	}
}