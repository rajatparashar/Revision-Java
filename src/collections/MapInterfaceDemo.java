package collections;

import java.util.HashMap;

// Map stores the values in Key and Value pair

import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Rajat");
		map.put("actor", "John");
		map.put("CEO", "Sundar Pichai");
		System.out.println(map); // Output: {actor=John, myName=Rajat, CEO=Sundar Pichai}
		// Here also we can see the order of inserting and printing the elements are different
		// It is again due to using HashMap, which uses the concept of Hash code
		
		System.out.println(map.get("myName")); // Rajat
		System.out.println(map.get("actor1")); // null
		
		// The method keySet() returns a Set of all the Keys
		// Once we get all the keys, we can use them for iteration to get the value of their key
		
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			System.out.println(key+" : "+map.get(key));
		}
		
		/* Output is as below
		 actor : John
		 myName : Rajat
		 CEO : Sundar Pichai
		 */
		
		// Now try to add a new value to the existing key
		map.put("actor", "Akshay");
		for(String key:  map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		
		/* Output is as below
		 actor : Akshay
		 myName : Rajat
		 CEO : Sundar Pichai
		
		 As we can see that the value of key 'actor' is changed to 'Akshay', which means that the new value overrides the old value
		 The Keys in Map cannot be duplicate, it allows only unique Keys
		 But the values can be duplicate
		 
		 */
	}
}