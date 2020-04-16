package str;

import java.util.Scanner;

public class str1 {
	public static void main(String[] args) {
		String b = "";
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}

