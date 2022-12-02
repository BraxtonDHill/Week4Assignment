import java.util.Arrays;

public class Week3Project2 {
	// Need help
	public static void main(String[] args) {
		String[] name = new String[6];
		name[0] = "Sam";
		name[1] = "Tommy";
		name[2] = "Tim";
		name[3] = "Sally";
		name[4] = "Buck";
		name[5] = "Bob";

		int sum = 0;
		for (int i = 0; i < name.length; i++) {
			sum += name[i].length();
		}
		int average = sum / name.length;
		System.out.println(average); //Question 2a

		String allNames = "";
		for (int i = 0; i < name.length; i++) {
			allNames += name[i] + " ";
		}

		System.out.println(allNames); //Question 2b

		int[] nameLengths = new int[6];

		for (int i = 0; i < name.length; i++) {
			nameLengths[i] = name[i].length();
		}
	
		System.out.println(Arrays.toString(nameLengths)); //Question 5
		
		
		int sum2 = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum2 += nameLengths[i];
		}
		System.out.println("Sum of nameLengths: " +sum2);
			
	}
}