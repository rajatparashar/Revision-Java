package inheritance;

// Classes Calculator, CalculatorAdvanced, CalculatorVeryAdvanced are in Multi-level inheritance
// Inheritance is IS-A relationship

class Calculator { // super , Parent, Base
	public int add(int i, int j) {
		return i + j;
	}
}

class CalculatorAdvanced extends Calculator { // sub , Child, Derived
	public int subtract(int i, int j) {
		return i - j;
	}
}

class CalculatorVeryAdvanced extends CalculatorAdvanced {
	public int multiply(int i, int j) {
		return i * j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int result1 = c1.add(7, 3);
		System.out.println(result1); // 10

		CalculatorAdvanced c2 = new CalculatorAdvanced();
		int result2 = c2.add(1, 5);
		System.out.println(result2); // 6
		int result3 = c2.subtract(17, 6);
		System.out.println(result3); // 11

		CalculatorVeryAdvanced c3 = new CalculatorVeryAdvanced();
		int result4 = c3.add(3, 8);
		System.out.println(result4); // 11
		int result5 = c3.subtract(3, 1);
		System.out.println(result5); // 2
		int result6 = c3.multiply(4, 9);
		System.out.println(result6); // 36
	}
}