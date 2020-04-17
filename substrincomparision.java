package array;

import java.util.Scanner;

public class substringcomparision{
	
	public static String getSmallestAndLargest(String s, int k) {
		String s1 = s.substring(0, k);
		String smallest = s1;
		String largest = s1;

		for (int i = 0; i <= s.length() - k; i++) {
			s1 = s.substring(i, i + k);
			if (s1.compareTo(largest) > 0) {
				largest = s1;
			}
			if (s1.compareTo(smallest) < 0) {
				smallest = s1;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
	

	}
}
