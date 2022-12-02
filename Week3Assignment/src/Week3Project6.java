public class Week3Project6 {

	public static void main(String[] args) {
		double[] num = {20.2,9.9,21.3};
		System.out.println(totalNum(num));
	}
	public static double totalNum(double[] num) {
		double sum = 0.0;
		for (double i : num) {
			sum += i;
	}
	return (sum / num.length);
}
}