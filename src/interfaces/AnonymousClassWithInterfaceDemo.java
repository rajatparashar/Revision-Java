package interfaces;

interface Abc {
	void show();
}
/*
The purpose of this class is only to implement the interface Abc

class Implementor implements Abc {
	public void show() {
		System.out.println("I'm the best");
	}
}
So why to create an entire class just to implement 1 method of interface
*/

public class AnonymousClassWithInterfaceDemo {
	public static void main(String[] args) {
		
//		Abc obj = new Abc() ; This line gives compile time error: "Cannot instantiate the type Abc"

		// See below to use Anonymous class with interface
		Abc obj = new Abc() { // this is Anonymous class 
			public void show() {
				System.out.println("I'm the best");
			}
		};
		
		obj.show(); // I'm the best
	}
}