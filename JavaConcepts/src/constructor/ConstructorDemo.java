package constructor;

class Calculator {
	int num1;
	int num2;
	int result; // instance variable

	public void perform() {
		result = num1 + num2;
	}

	public Calculator() { // default Constructor
		num1 = 5;
		num2 = 5;
		System.out.println("In Constructor");
	}

	public Calculator(int n) { // parameterized Constructor
		num1 = n;
		num2 = n;
	}
	
	public Calculator(double d) { // parameterized Constructor
		num1 = (int) d;
	}
	
	public Calculator(double d, int n) { // parameterized Constructor
		num1 = (int) d;
		num1 = n;
		
	}
}

public class ConstructorDemo {

	/*
	 * 1. Constructor is a member method
	 * 2. Same name as Class name
	 * 3. It does not return anything
	 * 4. It is used to allocate memory
	 */
	public static void main(String[] args) {
		Calculator calc1 = new Calculator(); // object creation through new Calculator()
		System.out.println(calc1.num1); //5
		
		Calculator calc2 = new Calculator(7);
		System.out.println(calc2.num1); // 7
		
		Calculator calc3 = new Calculator(6.8);
		System.out.println(calc3.num1); //6
		
		Calculator calc4 = new Calculator(8.2, 3);
		System.out.println(calc4.num1); //3
	}
}