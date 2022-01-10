package overloading;

class CasioCalc {
	
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {	//overloaded method
		System.out.println(i + j + k);
	}

	public void add(double i, double j) {	//overloaded method
		System.out.println(i + j);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		CasioCalc obj = new CasioCalc();
		obj.add(4, 3);//7
		obj.add(4, 3, 5);//12
		obj.add(1.4, 3.5);//4.9
	}
}