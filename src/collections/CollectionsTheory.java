package collections;

public class CollectionsTheory {

	/*
	 * 
	 * collection - this is a topic/concept Collection - it is an interface
	 * Collections - this is a class
	 * 
	 * Collections API has multiple classes and interfaces
	 * 
	 * Collections are used to store multiple values. And first thing comes to our mind to store multiple values is an array
	 * 
	 * so we create an array as below int arr[] = new int[5]; the array arr is created with size of 5.
	 * 
	 * The size of the arr is fixed, but problem here is that we cannot expand it and shrink it.
	 * 
	 * I need something which is expandable, which can shrink or expand depending upon the user requirement
	 * The solution to this problem is Collection
	 * 
	 * Below is the way to create a collection
	 * 
	 * Collection values = new ArrayList();
	 * 
	 * ArrayList is a class which implements Collection(interface) indirectly
	 * because ArrayList implements List(interface) and List extends Collection
	 * 
	 * Below is the way to add values to add in Collection 
	 * 
	 * values.add(5);
	 * values.add(10);
	 * 
	 * If the requirement is to have a fixed number of elements, then always go for Array because Arrays are faster than collections
	 * 
	 * In above examples of arr Array, the type is int, but there is no type of collection 'values'.
	 * So by default the type of 'values' is 'Object'.
	 * Meaning that, we can use any type of values in 'values' collection like values.add("Rajat");
	 * 
	 * 
	 * When we want to restrict the type to a particular type then we need to Generics
	 * 
	 * Below is the way to use Generics
	 * Collection<Integer> values = new ArrayList<Integer>();
	 * 
	 * Now if we want to add the below line, it will give error
	 * values.add("Rajat");
	 * because we have collection of Integers and we are adding String "Rajat"
	 * 
	 * 
	 * Now why angular brackets <> are used, because every other kind of brackets are already booked
	 * () - for methods
	 * [] - for arrays
	 * {} - for class and method definitions
	 * 
	 * 
	 * Collection API was introduced in Java 1.2
	 * Generics was introduced in Java 1.5
	 * 
	 * In Java 1.7, we got an update, that if we have defined the type on the left side of = symbol, then no need to mention it on right side.
	 * So the syntax becomes like below - this only works in Java 1.7 and above
	 * Collection<Integer> values = new ArrayList<>();
	 * 
	 * Collection do not support index numbers 
	 *
	 * List works with index numbers, so if we want to add a value at a certain index, then we can do with the help of List
	 * List can have duplicate elements.
	 * 
	 * Set cannot have duplicate elements, so if we want to have all unique elements, we use Set.
	 * Set is implemented by HashSet Class
	 * 
	 * Set<Integer> set = new HashSet<>();
	 * 
	 * In case of List, the order of fetching elements is fixed, meaning the order of data entry will be same data as data fetching
	 * While in case of HashSet the oder of entering element will be different from elements fetching  
	 * 
	 * The TreeSet gives the elements in sorted format
	 * 
	 * 
	 * Map(interface) stores the data in (Key, Value) pair, means for every value there will be a key
	 * Map is implemented by HashMap Class
	 * 
	 * Map can be created as below
	 * Map<Key, Value> map = new HashMap<>();
	 * 
	 * Map<Integer, String> map = new HashMap<>();
	 * 
	 */
}