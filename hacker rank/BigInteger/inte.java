package big;

import java.math.BigInteger;
import java.util.Scanner;

public class inte {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		BigInteger n1 = in.nextBigInteger();
		in.close();
		BigInteger add = n.add(n1);
		BigInteger mul = n.multiply(n1);
		System.out.println(add);
		System.out.println(mul);

	}
}

