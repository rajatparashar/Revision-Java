package classobject;

//object knows something and Object does something

class Calculator {
	int num1;
	int num2;
	int result;

	public void perform() {
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calculator calc; // reference variable of type Calculator
		calc = new Calculator(); // object creation through new Calculator()

		calc.num1 = 3;
		calc.num2 = 5;
		calc.perform();
		System.out.println(calc.result);
	}
}