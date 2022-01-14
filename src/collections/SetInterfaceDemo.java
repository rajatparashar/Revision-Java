package collections;

// The Set supports ONLY unique elements
// Duplicate elements are not allowed
// add() method returns boolean value

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(6);
		set.add(9);
		set.add(1);
		
		for(int i: set) {
			System.out.println(i);
		}
		
		/* Output
		 * 1
		 * 5
		 * 6
		 * 9
		 */
		// Now add a duplicate element as below
		set.add(9);
		for(int i: set) {
			System.out.println(i);
		}
		
		/* Output will still be the same as the previous one after adding duplicate element
		 * 1
		 * 5
		 * 6
		 * 9
		 */
		
		// Now add some elements in set and write them within print statement to see their boolean values
		
		System.out.println(set.add(2)); //true
		System.out.println(set.add(3));	//true
		System.out.println(set.add(5));	//false
		System.out.println(set.add(9));	//false
		System.out.println(set.add(8));	//true
		
		
		// Lets create another Set
		Set<Integer> set2 = new HashSet<>();
		set2.add(87);
		set2.add(97);
		set2.add(34);
		set2.add(92);
		for(int i: set2) {
			System.out.println(i);
		}
		/* Output is below, but as we can see that the output elements are randomly printed
		 97
		 34
		 87
		 92
		
		The problem here with printing order is that we are using HashSet, 
		and it uses the concept of Hashing
		Hashing uses some algorithm to store and retrieve the data on some criteria hence it doesn't gives the elements in same order as of in input
		
		If we want to store and retrieve the elements in sorted order then we use TreeSet class 
		
		 */
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(87);
		treeSet.add(97);
		treeSet.add(34);
		treeSet.add(92);
		
		for(int i: treeSet) {
			System.out.println(i);
		}
		
		/* Output will be
		 34
		 87
		 92
		 97
		 */
	}
}