package interfaces;

// Anonymous Classes are for 1 time use

class A {
	public void show() {
		System.out.println("In A show");
	}
}

class B extends A {
	@Override
	public void show() {
		System.out.println("In A show");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {

		A obj = new A();
		obj.show(); // In A show

		// Now suppose I want to print "I'm the best",without changing anything in class A method
		// for doing that, I would require to create another class calld B, which will extend A and it will overrideshow() method of class A
		// But just to print 1 line of statement, I would require to create an entire class.
		// This can be done by Anonymous Class

		// See below

		A obj1 = new A() {
			public void show() {
				System.out.println("I'm the best");
			}
		};
		obj1.show(); // I'm the best

		/*
		 * Here the below is anonymous class
		 
		 new A() {
		 	public void show() {
		 		System.out.println("I'm the best");
		 		}
		 	};
		 */
	}
}