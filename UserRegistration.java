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
		boolean matcher = mobile.matches("(([0-9]{2})?)[ ][0-9]{10}");
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
	public void ValidateEmail() {

		String matcher="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
		ArrayList<String> validate = new ArrayList<>();
		// valid email
		validate.add("abc@yahoo.com");
		validate.add("abc-100@yahoo.com");
		validate.add("abc.100@yahoo.com");
		validate.add("abc-100@abc.net");
		validate.add("abc.100@abc.com.au");
		validate.add("abc@1.com");
		validate.add("abc@gmail.com.com");
		validate.add("abc+100@gmail.com");
		// invalid email
		validate.add("abc-");
		validate.add("abc@.com");
		validate.add("abc@123gmail.a");
		validate.add("abc123@.com");
		validate.add("abc123@.com.com");
		validate.add(".abc@abc.com");
		validate.add("abc()*@gmail.com");
		validate.add("abc@%*.com.com");
		validate.add("abc..2002@.gmail.com");
		validate.add("abc.@gmail.com");
		validate.add("abc@abc@gmail.com");
		validate.add("abc@gmail.com.1a");
		validate.add("abc@gmail.com.aa.au");
		for(String validate1 : validate) {
			System.out.println(validate1+" "+(validate1.matches(matcher)));
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
		register.ValidateEmail();
	}
}
