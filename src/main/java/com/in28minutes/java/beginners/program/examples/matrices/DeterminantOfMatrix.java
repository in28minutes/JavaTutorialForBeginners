package com.in28minutes.java.beginners.program.examples.matrices;

public class DeterminantOfMatrix {

	public static long determinant(int[][] matrix) {

		long determinant = 0;

		validate(matrix);

		//Base conditions
		if (matrix.length == 1) {
			return matrix[0][0];
		}

		if (matrix.length == 2) {
			return matrix[0][0] * matrix[1][1]
					- matrix[0][1] * matrix[1][0];
		}

		for (int i = 0; i < matrix[0].length; i++) {
			int intermediate[][] = new int[matrix.length - 1][matrix[0].length - 1];

			for (int j = 1; j < matrix.length; j++) {
				System.arraycopy(matrix[j], 0,
						intermediate[j - 1], 0, i);
				System.arraycopy(matrix[j], i + 1,
						intermediate[j - 1], i,
						matrix[0].length - i - 1);
			}

			determinant += matrix[0][i] * Math.pow(-1, i)
					* determinant(intermediate);
		}

		return determinant;
	}

	private static void validate(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			throw new IllegalArgumentException(
					"Matrix should have same number of rows and columns");
		}
	}

	public static void main(String[] args) {
		int x[][] = { { 10, 12, 13 }, { 18, 15, 90 },
				{ 10, 15, 18 } };
		System.out.println(DeterminantOfMatrix
				.determinant(x));//-2328
	}
}