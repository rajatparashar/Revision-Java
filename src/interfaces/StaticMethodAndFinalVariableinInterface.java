package interfaces;

// If we want to call the default method of interface then we nee to create a class which implements that Interface and create object of that class and call those methods
// But just to call 1 method, there is no need to create a class and its object
// We can create a static method in Interface and call them with interfacename.methodname()
// By default all the variables in interfaces are final/constant and even if user does not specify final keyword, it will automatically there

@FunctionalInterface
interface MyDemo {
	void abc();
	default void show() {
		System.out.println("in show");
	}
	
	static void display() {
		System.out.println("In display");
	}
	
	
//	int i ; compile error: "The final field i may not have been initialized"
	int num = 8;
	
}

class InterfacImp implements MyDemo {

	public void abc() {
	// num = 9; compile error: "The final field MyDemo.num cannot be assigned"
	}
	
}

public class StaticMethodAndFinalVariableinInterface {
	public static void main(String[] args) {
		MyDemo.display();
	}
}