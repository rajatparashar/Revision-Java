package iteration;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		
		// this is Enhanced For Loop for 1D Array
		for(int k : a) { 
			System.out.println(k);
		}

		int d[][] = { { 1, 2, 3, 4 },
				      { 2, 4, 8 },
				      { 5, 6, 7, 8, 9 }
				};

		// this is Enhanced For Loop for 2D Array
		for(int k[]: d) { // int k[]: d returns the arrays 1by 1 from d to array k
			for(int j:k) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}