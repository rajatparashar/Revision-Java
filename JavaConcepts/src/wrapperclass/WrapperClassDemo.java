package wrapperclass;

// bit, byte, short, int, long, double, char, boolean are primitive data types
// Primitive data are not acceptable in OOPs, only Objects are acceptable
// Bit, Byte, Short, Integer, Long, Double, Character, Boolean are classes
// Primitive data are faster than Wrapper classes


public class WrapperClassDemo {

	public static void main(String[] args) {
		int i = 5; // Primitive data
		Integer ii = new Integer(5); // object, Wrapper class
		
		float f = 6.6f;
		Float ff = new Float(f); // Boxing or Wrapping
		
		float j = ff.floatValue(); //Unboxing or Unwrapping
		
		Integer value = i; //AutoBoxing or AutoWrapping
		
		int k = value;	//AutoUnBoxing or AutoUnWrapping
	}
}