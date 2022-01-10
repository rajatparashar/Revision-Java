package overloading;

class Casio {
	int num1;
	int num2;
	String operation;

	public Casio() {
		num1 = 0;
		num2 = 0;
		operation = "nothing";
	}

	public Casio(int i) {	//overloaded constructor
		num1 = i;
		num2 = 0;
		operation = "nothing";
	}

	public Casio(int i, int j) {	//overloaded constructor
		num1 = i;
		num2 = j;
		operation = "nothing";
	}

	public Casio(int i, int j, String op) {	//overloaded constructor
		num1 = i;
		num2 = j;
		operation = op;
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Casio obj1 = new Casio();
		Casio obj2 = new Casio(3);
		Casio obj3 = new Casio(5, 9);
		Casio obj4 = new Casio(8, 1, "Hello");
	}
}