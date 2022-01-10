package interfaces;

// Benefit of using Interface is that we can implement multiple interfaces and extend a class

// Java does not support Multiple inheritance using classes but it supports Multiple inheritance using Interfaces 
// In Abstract class, we can have abstract methods as well as concrete methods
// But an Interface can have only abstract methods
// All methods in an Interface are by default public and abstract
// Implements is used for class-class, interface-interface relationships
// Extends is used for Class-interface relationships
// We cannot create object of Interface but we can create reference of Interface
// Given a choice, always prefer to use Interfaces, as it provides flexibility to extend a class in future(in case if comebody want to do so)

interface Writer {
	abstract void write();
}

class Pen implements Writer {

	@Override
	public void write() {
		System.out.println("Im a Pen");
	}
}

class Pencil implements Writer {

	@Override
	public void write() {
		System.out.println("Im a Pencil");
	}
}

class Kit {
	public void doSomething(Writer w) {
		w.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Kit k = new Kit();

		Writer p = new Pen();
		k.doSomething(p); // Im a Pen

		Writer pc = new Pencil();
		k.doSomething(pc); // Im a Pencil

		// here in the doSomething method we are passing the object of pen or Pencil.
		// So depending upon the type, the write method() will be called corresponding
		// to Pen class method or Pencil class method
	}
}