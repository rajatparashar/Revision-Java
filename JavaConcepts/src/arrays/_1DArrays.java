package arrays;

class Student {
	int rollNo;
	String name;
	
	
}

public class _1DArrays {

	public static void main(String[] args) {
		int nums[] = new int[4]; // creating array 'nums' of type integer with size = 4

		nums[0] = 8;
		nums[1] = 12;
		nums[2] = 76;
		nums[3] = 54;

		System.out.println(nums[2]); // 76

		nums[2] = 99;
		System.out.println(nums[2]); // 99

//		System.out.println(nums[4]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4

		for (int i = 0; i < 4; i++) {
			System.out.println(nums[i]);
		}

		// if we know the values we can directly provide the values at initialization of Array
		int nums2[] = { 8, 12, 76, 54 };
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Student s[] = {s1,s2,s3,s4}; // creating the aray of Objects 
	}
}