import java.util.Scanner;

public class Week3Project9 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What hour of the night is it?");
		int timeOfNight = keyboard.nextInt();
		System.out.println("True or False: Are you at home?");
		boolean locationNow = keyboard.nextBoolean();
		System.out.println(shouldIGoToBed(timeOfNight, locationNow));
	}

	static boolean shouldIGoToBed(double timeOfNight, boolean locationNow) {
		boolean shouldIGoToBed = timeOfNight > 10 && locationNow == true;
		return shouldIGoToBed;
	}
}

//I wrote this method to tell my self when I should be going to bed, because of my habit of staying up too late. The method will tell me to go to bed if it is past 10pm and I am at home
