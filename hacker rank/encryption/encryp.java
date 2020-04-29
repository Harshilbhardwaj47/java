package md5;

import java.util.Scanner;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class encryp {
	public static String encrypt(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");

			byte[] messageDigest = md.digest(input.getBytes());

			BigInteger no = new BigInteger(1, messageDigest);

			String hastext = no.toString(16);

			while (hastext.length() < 32) {
				hastext = "0" + hastext;
			}
			return hastext;

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(encrypt(s));
	}
}

