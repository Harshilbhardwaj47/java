package date;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class datetime {
	public static void main(String[] args) throws IOException {
		int day = 0;
		int year = 0;
		int month = 0;
		fv(month, day, year);
	}

	private static void fv(int month, int day, int year) {
		Scanner in = new Scanner(System.in);
		int mm = in.nextInt();
//String day = in.next();
		int dd = in.nextInt();
//String year = in.next();
		int yy = in.nextInt();
		in.close();
		LocalDate dt = LocalDate.of(yy, mm, dd);
		System.out.print(dt.getDayOfWeek());
	}
}

