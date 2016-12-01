package com.in28minutes.java.beginners.program.examples.matrices;

import java.util.Arrays;

public class MatrixMultiplication {

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		validateIfMultiplicationIsPossible(matrix1, matrix2);

		int matrix1Rows = matrix1.length;
		int matrix1Cols = matrix1[0].length;
		int matrix2Cols = matrix2[0].length;

		int[][] result = new int[matrix1Rows][matrix2Cols];

		for (int i = 0; i < matrix1Rows; i++)
			for (int j = 0; j < matrix2Cols; j++) {
				for (int k = 0; k < matrix1Cols; k++)
					result[i][j] += matrix1[i][k] * matrix2[k][j];
			}

		return result;
	}

	private static void validateIfMultiplicationIsPossible(int[][] matrix1,
			int[][] matrix2) {
		if (matrix1[0].length != matrix2.length)
			throw new IllegalArgumentException(
					"Matrix 1 Columns != Matrix 2 Rows: " + matrix1[0].length
							+ " != " + matrix2.length);
	}

	public static void main(String[] args) {

		int x[][] = { { 10, 2, 13 }, { 8, 15, 90 }, };
		int y[][] = { { 14, 12 }, { 14, 12 }, { 12, 12 }, };
		int z[][] = MatrixMultiplication.multiply(x, y);
		System.out.println(Arrays.deepToString(z));//[[324, 300], [1402, 1356]]
	}

}
