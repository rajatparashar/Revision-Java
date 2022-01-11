package interfaces;
// In Abstract Class -> Declare and Define method

// In Interface -> Declare till Java 1.7
// In Java 1.8 , we can define method in Interface
// Functional Interface can have only 1 abstract method

@FunctionalInterface
interface Demo {
	void abc(); // abstract method
//	public void show() { System.out.println("In show");} compile error: "Abstract methods do not specify a body"
// for defining we will use default keyword 

	default void show() { // concrete/default method
		System.out.println("In show");
	}
}

class DemoImpl implements Demo {
	public void abc() {
		System.out.println("in abc");
	}

	public void show() { // overrided method
		System.out.println("In New show");
	}
}

public class DefaultMethodinInterfaceDemo {
	public static void main(String[] args) {

		Demo obj = new DemoImpl();
		obj.show();
		obj.abc();
	}
}