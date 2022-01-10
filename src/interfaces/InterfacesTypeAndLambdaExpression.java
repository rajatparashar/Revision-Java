package interfaces;
// Types of interfaces
// 1. Normal interface - which has more than 1 method
// 2. Single Abstract method interface(also called as Functional interface) - which has only and exactly 1 method
// 3. Marker - which has no methods like Serializable 

// In Functional interface, we can useLambda expression

@FunctionalInterface
interface Abcd {
	void show();
}

public class InterfacesTypeAndLambdaExpression {

	public static void main(String[] args) {
		Abcd obj = new Abcd() {
			public void show() {
				System.out.println("I'm the best");
			}
		};
		obj.show(); // I'm the best

		// As we know that the Functional interface has only 1 method so why to even write new Abcd() { public void show() {
		// It can be modified as below
		
		Abcd obj1 = () ->{
				System.out.println("I'm the best");
		};
		obj1.show(); // I'm the best
		
		// As in above way of creating object, we can see that we have deleted the Boilerplate code(means the extra code, which is quite obvious to understand by the compiler)
		// It can be further breakdown to the below(because it has only 1 statement to print)
		
		Abcd obj2 = () -> System.out.println("I'm the best"); // this is called as Lambda expression
		
		// Lamda expressions work ONLY with Functional interfaces because other interfaces will have more than 1 method, and it will be confusing if we dont mention the method name in Lambda expression
		
		obj2.show(); // I'm the best
	}
}