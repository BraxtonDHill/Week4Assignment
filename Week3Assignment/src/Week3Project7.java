public class Week3Project7 {

	public static void main(String[] args) {
		double[] arr1 = {25.7,62.6};
		double[] arr2 = {20.6,30.7};
		System.out.println(arrCheck(arr1, arr2));
	}
	public static boolean arrCheck(double [] arr1, double[] arr2) {
		double average1 = 0.0;
		double totalSum1 = 0.0;
		double average2 = 0.0;
		double totalSum2 = 0.0;
		
		for (int i = 0; i < arr1.length; i++) {
			totalSum1 += arr1[i];
		}
		average1 = (totalSum1 / arr1.length);
		
		for (int i = 0; i < arr2.length; i++) {
			totalSum2 += arr2[i];
		}
		average2 = (totalSum2 / arr2.length);
		
		if (average1 > average2) {
			return true;
		} else {
			return false;
		}
	}
	
}
