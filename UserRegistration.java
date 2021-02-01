import java.util.*;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	public static void FirstName() {
		System.out.println("Enter the first name: ");
		String firstName = sc.nextLine();
		boolean matcher = firstName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			System.out.println("Valid First Name");
		}else {
			System.out.println("Invalid First Name");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration Problem");
		FirstName();

	}
}
