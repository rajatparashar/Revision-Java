package supermethod;

// Concept1: Whenever you try to create the object of Sub class, it will also call the constructor of super class
// Concept2: Whenever you try to create the object of Sub class by specifying the parameter, it will call the specified constructor of sub class, and it will call the default constructor of super class
// By default, every constructor in class will have a statement super(); as the first line, even if the user does not mention it in code.
// By super(), the default constructor of parent class is called 
// If we write super(i); then it will call the parameterized constructor of parent class
class A {
	public A() {
		System.out.println("in A");
	}

	public A(int i) {
		System.out.println("in A int");
	}

	public A(double i) {
		System.out.println("in A double");
	}
}

class B extends A {
	public B() {
		System.out.println("in B");
	}

	public B(int i) {
		System.out.println("in B int");
	}

	public B(double i) {
		super(i);
		System.out.println("in B double");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		A obj1 = new A(); // prints in A

		B obj2 = new B();
		// prints
		// in A
		// in B

		B obj3 = new B(5);
		// prints
		// in A
		// in B int

		B obj4 = new B(5.6d);
		// prints
		// in A double
		// in B double
	}
}