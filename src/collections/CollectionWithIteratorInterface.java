package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithIteratorInterface {

	public static void main(String[] args) {
		Collection values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add("Rajat");

		System.out.println(values); // prints: [4, 6, Rajat]
		// Now if I want to print all the values on different lines.
		// Collection doesn't support index numbers
		// The way is to use Iterator

		Iterator it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			/*
			 This prints below output
			 4
			 6
			 Rajat
			 */
		}
	}
}