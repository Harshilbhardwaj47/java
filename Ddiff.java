import java.util.Scanner;

public class test_line {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sumd1 = 0, sumd2 = 0;
		//System.out.println("enter the dimenssion of two d array");
		int size = in.nextInt();
		int[][] twodarray = new int[size][size];
		// input the array elements
		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray.length; j++) {
				twodarray[i][j] = in.nextInt();
			}
		}
		// processing to calculate the diagonal sum
		// Initialize sums of diagonals
		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray.length; j++) {
				// finding sum of primary diagonal
				if (i == j)
					sumd1 += twodarray[i][j];

				// finding sum of secondary diagonal
				if (i == twodarray.length - j - 1)
					sumd2 += twodarray[i][j];
			}
		}

		// Absolute difference of the sums
		// across the diagonals
		System.out.println(Math.abs(sumd1 - sumd2));
	}

}

