package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// The problem with collection is that Collection doesn't support index numbers
// To overcome this issue, we can use List interface 
// ArrayList(class) implements List(interface) and List(interface) extends Collection(interface)
// So indirectly, ArrayList implements Collection

public class ListDemo {

	public static void main(String[] args) {
		List values = new ArrayList<>();
		// This List is of Object data type which support objects
		values.add(4); // This is not simple add(4), but internally it is new Integer(4) which is an object which comes from Wrapper class concept
		values.add("Rajat");
		values.add(6);
		values.add(9);
		values.add(2, 1); // This will add the value 1 on index 2
		Iterator it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			/*
			 This prints below output
			 4
			 Rajat
			 6
			 1
			 9
			 */
		}

		// Now lets see how lists can be iterated using for loop
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

		// Iterating using for Each loop
		// Since values is of Object type so we will us Object data type for variable to be used

		for (Object o : values) {
			System.out.println(o);
		}
	}
}