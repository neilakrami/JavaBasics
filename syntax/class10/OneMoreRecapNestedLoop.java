package com.syntax.class10;

public class OneMoreRecapNestedLoop {

	public static void main(String[] args) {
		// We bought a new car
		// It starts with 0000 mileage and it increases
		// Please print every mileage
		// It goes 0001, 0002, 0003......9999

	

		for (int i = 0; i <= 9; i++) {
			// System.out.print(i);

			for (int j = 0; j <= 9; j++) {

				for (int k = 0; k <= 9; k++) {

					for (int l = 0; l <= 9; l++) {
						System.out.println(i + " " + j + k + l);
					}
				}

			}

		}

	}

}
