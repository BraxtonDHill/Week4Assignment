import java.util.Scanner;

public class Week3Project4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an first name");
		String firstName = keyboard.nextLine();
		System.out.println("enter an last name");
		String lastName = keyboard.nextLine();
		
	String test = fullName(firstName, lastName);
	System.out.println(test);
	}

	static String fullName(String firstName, String lastName) {
		String name = firstName + " " + lastName;
		return name;

	}
	
}

