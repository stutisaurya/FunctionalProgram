package com.FunctionalProgram;

import java.util.Scanner;

public class LeapYear {

	static boolean isLeap(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year in 4 digit");
		int year = sc.nextInt();

		while (year < 999 || year > 9999) {
			System.out.println("wrong input");
			System.out.println("enter year in 4 digit");
			year = sc.nextInt();
		}
		if (isLeap(year)) {
			System.out.println(year + " is a leap year");
		} else
			System.out.println(year + " is not a leap year");
		sc.close();
	}

}
