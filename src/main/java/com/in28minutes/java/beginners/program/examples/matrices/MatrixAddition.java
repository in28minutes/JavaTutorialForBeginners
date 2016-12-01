package com.in28minutes.java.beginners.program.examples.matrices;

import java.util.Arrays;

public class MatrixAddition {

	public static int[][] add(int[][] matrix1, int[][] matrix2) {
		validateIfAdditionIsPossible(matrix1, matrix2);

		int rows = matrix1.length;
		int cols = matrix1[0].length;

		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++) {
					result[i][j] += matrix1[i][j] + matrix2[i][j];
			}

		return result;
	}

	private static void validateIfAdditionIsPossible(int[][] matrix1,
			int[][] matrix2) {
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length)
			throw new IllegalArgumentException(
					"Matrix 1 & Matrix 2 should have equal rows and columns.");
	}

	public static void main(String[] args) {

		int x[][] = { { 10, 12, 13 }, { 18, 15, 90 } };
		int y[][] = { { 14, 12, 12 }, { 14, 12, 99 } };
		
		int z[][] = MatrixAddition.add(x, y);
		System.out.println(Arrays.deepToString(z));//[[24, 24, 25], [32, 27, 189]]
	}

}
