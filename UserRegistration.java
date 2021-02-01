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
			FirstName();
		}

	}

	public void LastName() {
		System.out.println("Enter the last name: ");
		String lastName = sc.nextLine();
		boolean matcher = lastName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			System.out.println("Valid Last Name");
			Email();
		}else {
			System.out.println("Invalid Last Name");
			FirstName();
		}

	}

	public void Email() {
		System.out.println("Enter the valid email: ");
		String email = sc.nextLine();
		boolean matcher = email.matches( "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$");
		if(matcher == true) {
			System.out.println("Valid Email");
			Mobile();
		}else {
			System.out.println("Invalid Email");
			LastName();
		}
	}

	public void Mobile() {
		System.out.println("Enter the valid mobile number: ");
		String mobile = sc.nextLine();
		boolean matcher = mobile.matches("([0-9]{2})?[7-9][0-9]{9}");
		if(matcher == true) {
			System.out.println("Valid Mobile Number");
			Password();
		}else {
			System.out.println("Invalid Mobile Number");
			Mobile();
		}
	}

	public void Password() {
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		boolean matcher = password.matches("(^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*[@*&^%#-*+!]{1}).{8,}$");
		if(matcher == true) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
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
}
