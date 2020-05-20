package grading;

import java.util.Scanner;

class Students {
	private static int num;
	private static int stugrades[];
	private static Scanner in;

	Students() {
		in = new Scanner(System.in);
		// System.out.println("Enter the number of Students");
		num = in.nextInt();
		stugrades = new int[num];
		grades();
		roundoff();
	}

	private static void grades() {
		in = new Scanner(System.in);
		for (int i = 0; i < stugrades.length; i++) {
			// System.out.println("Enter number of student " + i);
			stugrades[i] = in.nextInt();
		}

	}

	private static void roundoff() {
		for (int i = 0; i < stugrades.length; i++) {
			if (stugrades[i] > 38 && (stugrades[i] + 3) % 5 == 1) {
				System.out.println(stugrades[i] + 2);
			} else if (stugrades[i] > 38 && (stugrades[i] + 3) % 5 == 2) {
				System.out.println(stugrades[i] + 1);
			} else {
				System.out.println(stugrades[i]);
			}
		}
	}
}

public class Grade {
	public static void main(String[] args) {
		new Students();
	}

}

