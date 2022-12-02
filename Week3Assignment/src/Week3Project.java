public class Week3Project {


public static void main(String[] args) {
	int[] age = new int [9];
	
	age[0] = 3;
	age[1] = 9;
	age[2] = 23;
	age[3] = 64;
	age[4] = 2;
	age[5] = 8;
	age[6] = 28;
	age[7] = 93;
	age[8] = 1;
		System.out.println(age[0]- age[age.length - 1]); 
	int length = age.length;
	int sum = 0;
	for (int i = 0; i < age.length; i++) {
		sum += age[i];
	}
	int average = sum / length;
	System.out.println("Average of array : "+average);
	
}
}



