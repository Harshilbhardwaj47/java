package zoo;

import java.util.Scanner;

public class zoo {
	public static void main(String[] args) {
		int z = 0;
		int o = 0;
		Scanner in = new Scanner(System.in);
		// input String
		String zoo = in.nextLine();
		// run iteration over this array
		for (int i = 0; i < zoo.length(); i++) {
			char ch = zoo.charAt(i);
			if (ch == 'z' || ch == 'z') {
				z++;
			} else if (ch == 'o' || ch == 'O') {
				o++;
			} else {
				System.out.println("invalid statement");
			}
		}
		if (2 * z == o) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

