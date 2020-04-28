import java.util.Scanner;

public class bcake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// input the age
		int age = in.nextInt();
		// define an array of size age
		int[] array = new int[age];
		// intput the geight ass array elements
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		// temp and sum variable declaration
		int temp = 0, sum = 1;
		// checking the greatest number and count how many times it have ouccured
		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
				// System.out.println("yo");
			} else {
				if (temp == array[i]) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}

