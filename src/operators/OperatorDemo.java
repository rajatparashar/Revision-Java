package operators;

public class OperatorDemo {

	/*
	 * Arithmetic - + ,- ,* , / , % 
	 * Bitwise
	 * Relational
	 * Logical
	 * 
	 */
	public static void main(String[] args) {
		int m = 6, n = 4;
		int sum = m + n;		
		int difference = m - n;	
		int multiply = m * n;	
		int division = m / n;	
		
		double div = (double)m/n;	
		
		int remainder = m%n;	//2
		
		System.out.println(sum);	//10
		System.out.println(difference);	//2
		System.out.println(multiply);	//24
		System.out.println(division);//1 (Integer only)
		System.out.println(div);//1.5
		System.out.println(remainder); //2
		
		n += m ; // it is same as n = n + m
		System.out.println(n);	//10
		
		n++ ; // it is same as n = n + 1 (post increament)
		System.out.println(n);	//11
		
		n-- ; // it is same as n = n - 1 (post decreament)
		System.out.println(n);	//10
		
		++n ; // it is same as n = n + 1 (pre increament)
		System.out.println(n);	//11
		
		--n ; // it is same as n = n - 1 (pre decreament)
		System.out.println(n);	//10
	}

}
