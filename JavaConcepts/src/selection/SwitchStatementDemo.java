package selection;

public class SwitchStatementDemo {
	
	/*
	 * double - does not supported by Switch
	 * char - supported by Switch 
	 * String - supported by Switch (only in java with versions 1.7 or above)
	 */
	public static void main(String[] args) {
		int n = 4;

		switch (n) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("No match");
		}
	}
}