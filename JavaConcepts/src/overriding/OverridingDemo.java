package overriding;

// Overriding: The child class method overrides the parent class method
// Compile time errors are always better than Logical bugs

class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A {
	@Override // If the name of below method changes, then we will get compile time error
	public void show() {
		super.show(); // it will call show() method from class A
		System.out.println("In B");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.show();
		// prints below
		// In A
		// In B
	}
}