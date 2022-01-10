package encapsulation;
// object knows something with the help of variables and object does something with the help of methods

// We should create variables in such a way that these are inaccessible directly and should only be accessible through methods called Getters and Setters
// To set the value, we use Setter and to get the value, we use Getter
// Make the variables private and make Getters and Setters public
// This way we are binding the data with methods and this is called Encapsulation

class Student {
	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNo(6);
		s1.setName("Rajat");
		System.out.println(s1.getRollNo()); // 6
		System.out.println(s1.getName()); // Rajat
	}
}