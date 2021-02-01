import java.util.Scanner;

public class UserRegistration {

	static final Scanner sc = new Scanner(System.in);

	public void FirstName() {
		System.out.println("Enter the first name: ");
		String firstName = sc.nextLine();
		boolean matcher = firstName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			System.out.println("Valid First Name");
			 LastName(); {
			}
		}else {
			System.out.println("Invalid First Name");
		}

	}

	public void LastName() {
		System.out.println("Enter the last name: ");
		String lastName = sc.nextLine();
		boolean matcher = lastName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			System.out.println("Valid Last Name");
		}else {
			System.out.println("Invalid Last Name");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration Problem");
		UserRegistration register = new UserRegistration(); 
		boolean flag = true;
		while(flag)
		{
			register.FirstName();
			flag = false;
		}
	}
