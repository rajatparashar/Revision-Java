package innerclass;

class Outer {
	int a;
	public void show() { // method

	}

	// Outer$Inner1.class
	class Inner1 { // member class
		// this class can be static also
		public void display() {
			System.out.println("in display method of class Inner1");
		}
	}

	static class Inner2 { // static inner class
		public void display() {
			System.out.println("in display method of class Inner2");
		}
	}
}

public class InnerDemo {
	// we can create variables, methods

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();

//		Inner1 obj1 =  new Inner1(); this statement is showing compilation error because Inner class in not visible

		Outer.Inner1 innerObject1 = obj.new Inner1();
		// user Outer class name.Inner class name to create reference variable(Outer.Inner1 innerObject)
		// Inner1 class object to call the Inner class constructor (obj.new Inner1() )
		innerObject1.display();

		Outer.Inner2 innerObject2 = new Outer.Inner2();
		// reference varialble will be same as Outer class name.Inner class name (Outer.Inner2 innerObject2)
		// object will be created using new Outer class.Inner classname() ( new Outer.Inner2())
		innerObject2.display();
	}
}