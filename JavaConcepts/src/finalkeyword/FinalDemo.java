package finalkeyword;

// final keword can be used with the below:
// Variables - to create constant values. Once assigned , cannot be changed later
// Methods - to prevent method from being overridden in child class
// Class - no other can extend our class

class A {
	int i = 0;
	final int DAY = 0;
	final int j;

	public A() {
		i = 7;
//		DAY = 9;  compile error: "The final field A.DAY cannot be assigned"
		j = 12; // here it is assigned once
//		j = 15;  compile error: "The final field j may already have been assigned"
	}

	final public void show() {
		System.out.println("In A show");
	}
}

final class B extends A {
	/*
	 * public void show() { compile error: "Cannot override the final method from A"
	 * 		System.out.println("In B show");
	 * }
	 */
}

/*
class C extends B { compile error: "The type C cannot subclass the final B"
}
 */

public class FinalDemo {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.i); // 7

		B obj1 = new B();
		obj1.show();
	}
}