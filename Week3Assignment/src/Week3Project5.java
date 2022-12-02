public class Week3Project5 {
	public static void main(String[] args) {
		int[] num = { 20, 30, 55 };
		System.out.println(overHundred(num));
	}

	public static boolean overHundred(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		if (sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
}
