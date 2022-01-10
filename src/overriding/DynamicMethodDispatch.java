package overriding;

class Parent {
	public void show() {
		System.out.println("In Parent");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("In Child");
	}
}

class GrandChild extends Parent {
	public void show() {
		System.out.println("In GrandChild");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Parent obj1 = new Parent(); // reference is of Parent class and object if Parent class
		obj1.show(); // In Parent

		Child obj2 = new Child(); // reference is of Child class and object if Child class
		obj2.show(); // In Child

		Parent obj3 = new Child(); // reference is of Parent class and object if Child class(with this only those
									// method can be called which are available in both the classes)
		obj3.show(); // In Child

		obj3 = new GrandChild();
		// Below is called as Dynamic Method Dispatch
		obj3.show(); // In GrandChild

		/*
		 * Parent obj3 = new Child(); linking is done at runtime, so show() method of
		 * which class will be determined at the runtime It is called as Runtime
		 * Polymorphism
		 */

	}
}