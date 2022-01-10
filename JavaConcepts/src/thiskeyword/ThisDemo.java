package thiskeyword;

class Calculator {
	int num1; // instance variable
	int num2; // instance variable
	int result; // instance variable

	float n1; // instance variable
	float n2; // instance variable
	
	double d1; // instance variable
	double d2; // instance variable

	public void perform() {
		result = num1 + num2;
	}

	public Calculator(int number1, int number2) { // number1, number2 are local variables
		num1 = number1;
		num2 = number2;
	}

	public Calculator(float n1, float n2) { // n1, n2 are local variables
		n1 = n1; // here both are local variables. Reason: The Local variable always shadows the Instance variable
		n2 = n2;
	}
	
	public Calculator(double d1, double d2) { // n1, n2 are local variables
		//this keyword is used in case where local and instance variables have the same name
		// and not compulsory where local and instance variables have the different name
		//this represents the current object
		this.d1 = d1; // here this.d1 and this.d2 becomes instance variables instead of local variables
		this.d2 = d2;
	}

}

public class ThisDemo {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator(7, 3); // object creation through new Calculator()
		System.out.println(calc1.num1); // 7
		System.out.println(calc1.num2); // 3
		
		Calculator calc2 = new Calculator(7.5f, 8.13f); // object creation through new Calculator()
		System.out.println(calc2.n1); // 0.0
		System.out.println(calc2.n2); // 0.0
		
		Calculator calc3 = new Calculator(4.57d, 10.14d); // object creation through new Calculator()
		System.out.println(calc3.d1); // 4.57
		System.out.println(calc3.d2); // 10.14

	}
}