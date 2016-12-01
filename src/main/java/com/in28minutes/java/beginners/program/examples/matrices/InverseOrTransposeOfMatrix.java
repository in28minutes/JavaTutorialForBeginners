package com.in28minutes.java.beginners.program.examples.matrices;

import java.util.Arrays;

public class InverseOrTransposeOfMatrix {

	public static int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] result = new int[cols][rows];

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++) {
					result[j][i] = matrix[i][j];
			}

		return result;
	}

	public static void main(String[] args) {
		int x[][] = { { 10, 12, 13 }, { 18, 15, 90 } };
		int y[][] = InverseOrTransposeOfMatrix.transpose(x);
		System.out.println(Arrays.deepToString(y));//[[10, 18], [12, 15], [13, 90]]
	}

}
