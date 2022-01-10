package iteration;

public class Jump_Break_ContinueDemo {
//break , continue
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) { // if i = 4, then that iteration will be skipped
				continue;
			}
			if (i == 8) { // if i = 8, then the control will come out of the loop
				break;
			}
			System.out.println("value is " + i);
		}
	}
}