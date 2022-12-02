import java.util.Scanner;

public class Week3Project3 {
	static String repeatWord(String userWord, int n) {
		// Write your code in here
		String finalWord = "";
		for (int i = 0; i < n; i++) {
			finalWord += userWord;
		}
		return finalWord;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an word");
		String word = keyboard.nextLine();
		System.out.println("enter a number");
		int num = keyboard.nextInt();
		System.out.println(repeatWord(word, num));
	}

}
