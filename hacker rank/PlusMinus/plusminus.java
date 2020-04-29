import java.util.Scanner;

public class pminus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float sump = 0, sumn = 0, sumz = 0;
		float n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			if (number > 0) {
				sump++;
			} else if (number == 0) {
				sumz++;
			} else {
				sumn++;
			}
		}
		System.out.println(sump/n);
		System.out.println(sumn/n);
		System.out.println(sumz/n);

	}
}

