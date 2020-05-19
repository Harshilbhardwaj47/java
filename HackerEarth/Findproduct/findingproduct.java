import java.util.Scanner;

public class fp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// input the number of numbers to be entered
		long x = in.nextLong();
		// define an array of x size
		long arr[] = new long[(int) x];
		// a variable to use instead of storing the numbers
		long pro = 1;
		// for loop to take input in the array
		for (long i = 0; i < arr.length; i++) {
			pro = in.nextInt() * pro;
		}
		System.out.println(pro);
	}
}

