package varargs;

// varargs means variable arguments - this to handle variable number of arguments in methods
// it is achieved by 3 dots like (int ... j)
// but if a method contains other variable of other data type then the varargs should be placed at last

class Calc {

	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(4, 5)); // 9
		System.out.println(obj.add(9, 5, 7, 9, 0, 2)); // 32
		System.out.println(obj.add(12, 5, 23, 53, 1, 4, 46)); // 144
		System.out.println(obj.add(4, 5, 2, 54, -1, 34, 6, 67, 68, 56, 17, 6, 27)); // 345
		System.out.println(obj.add(-14, 2, 6, 5)); // -1
	}
}