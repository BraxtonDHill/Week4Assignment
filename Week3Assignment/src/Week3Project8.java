import java.util.Scanner;

public class Week3Project8 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter money in your pocket");
		double moneyInPocket = keyboard.nextDouble();
		System.out.println("True or False: Is it hot outside?");
		boolean isHotOutside = keyboard.nextBoolean();
		System.out.println(willBuyDrink(moneyInPocket, isHotOutside));
	}

	static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {
		boolean willBuyDrink = moneyInPocket > 10.50 && isHotOutside == true;
		return willBuyDrink;
	}
}
