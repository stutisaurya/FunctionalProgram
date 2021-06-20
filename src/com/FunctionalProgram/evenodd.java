package com.FunctionalProgram;

import java.util.Scanner;

public class evenodd {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num; // Declare a variable
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("The entered number is even");
		else
			System.out.println("The entered number is odd");
	}

}
