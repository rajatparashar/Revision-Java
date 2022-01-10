package statickeyword;

// objects are created in HEAP memory
// in this case of Employees, all the employees from same company will have the same CEO
// Class are loaded by Class loader
// static variables are not object specific and they are same among all the objects
// hence making ceo as static
// no ned to initialize the static variables in Constructor, due to the fact that static variables are independent of objects.
// so we initialize them in static block
// cannot use non-static variables in static block


class Employee {

	int eid;
	int salary;
	static String ceo;

	static {	//executed when you load a class(only once)
		ceo = "Larry";
	}
	
	public Employee() { //it is executed when you create an object
		eid = 1;
		salary=3000;
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Employee rajat = new Employee();
		Employee rahul = new Employee();

		rajat.eid = 5;
		rajat.salary = 5000;
//		rajat.ceo = "Nikita"; // no need to call ceo with object, it can be called using Class name

//		Employee.ceo = "Nikita"; // here we don't need object, call with classname
		
		rahul.eid = 9;
		rahul.salary = 2000;
//		rahul.ceo = "Umesh";

		rajat.show();
		rahul.show();
	}
}