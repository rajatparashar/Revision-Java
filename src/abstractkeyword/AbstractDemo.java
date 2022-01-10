package abstractkeyword;

// If a class has at least 1 abstract class, than that class has to be declared abstract

abstract class Human { // this is Abstract class
	// If I don't want anyone to create the object of Human class, then make Human class as abstract
	public abstract void eat(); // abstract method

	public void walk() {

	}
}

class Man extends Human {// this is Concrete class
	public void eat() {
		
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
//		Human obj = new Human(); Cannot instantiate the type Human error
		Human obj = new Man();
	}
}