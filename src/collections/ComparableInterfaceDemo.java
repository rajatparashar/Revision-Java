package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int rollNo, marks;
	String name;

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	public int compareTo(Student s) {
		return marks>s.marks?1:-1; // applying logic for sorting
	}

}

public class ComparableInterfaceDemo  {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(15, "Alpha", 84));
		students.add(new Student(16, "Beta", 63));
		students.add(new Student(17, "Charlie", 57));
		students.add(new Student(18, "Delta", 91));

		for(Student s: students) {
			System.out.println(s);
		}
		/*Below is the output

		Student [rollNo=15, marks=84, name=Alpha]
		Student [rollNo=16, marks=63, name=Beta]
		Student [rollNo=17, marks=57, name=Charlie]
		Student [rollNo=18, marks=91, name=Delta]
		
		*/
		
		// Now let apply some sort on above List of Students
		// Collections.sort(students); compile error: "The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Student>)"
		// Meaning that we are not using the Comparable interface in our class
		// For doing that, we will implement Comparable interface in Student class
		// After implementing Comparable interface the below statement is not giving any error
		Collections.sort(students);
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		/*Below is the output

		Student [rollNo=17, marks=57, name=Charlie]
		Student [rollNo=16, marks=63, name=Beta]
		Student [rollNo=15, marks=84, name=Alpha]
		Student [rollNo=18, marks=91, name=Delta]
		
		*/
	}
}