package com.FunctionalProgram;

import java.util.Scanner;

public class Array2D {
	public void display() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size of an array: ");
		int arrayRowSize = s.nextInt();
		System.out.print("Enter the column size of an array: ");
		int arrayColSize = s.nextInt();

		int[][] arrayName = new int[arrayRowSize][arrayColSize];

		for (int i = 0; i < arrayRowSize; i++) {
			for (int j = 0; j < arrayColSize; j++) {
				System.out.println("Enter a value: ");
				arrayName[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < arrayRowSize; i++) {
			for (int j = 0; j < arrayColSize; j++) {
				System.out.print(arrayName[i][j] + " ");
			}
			System.out.println("\n");
		}
		s.close();

	}

	public static void main(String[] args) {
		Array2D d = new Array2D();
		d.display();
	}

}
