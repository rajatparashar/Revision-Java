package arrays;

public class _2DArrays {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 2, 4, 6, 8 };
		int c[] = { 5, 6, 7, 8 };
		// 3 arrays are created to store values
		// instead of creating 3 arrays, we can create one 2 Dimensional array

		int d[][] = { { 1, 2, 3, 4 },
					  { 2, 4, 8 },
					  { 5, 6, 7, 8, 9 }
					}; // Jagged arrays (diferent size of the columns)

		System.out.println(d[0][1]); // 2

		for (int i = 0; i < d.length; i++) { // count number of rows
			for (int j = 0; j < d[i].length; j++) { // count number of columns
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
}